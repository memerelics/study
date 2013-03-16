-module(mafiapp).
-export([install/1]).

-record(mafiapp_friends, {name, contact=[], info=[], expertise}).
-record(mafiapp_services, {from, to, date, description}).

install(Nodes) ->
  ok = mnesia:create_schema(Nodes),
  rpc:multicall(Nodes, application, start, [mnesia]),
  mnesia:create_table(mafiapp_friends,
    [{attributes, record_info(fields, mafiapp_friends)},
      {index, [#mafiapp_friends.expertise]},
      {disc_copies, Nodes}]),
  mnesia:create_table(mafiapp_services,
    [{attributes, record_info(fields, mafiapp_services)},
      {index, [#mafiapp_services.to]},
      {disc_copies, Nodes},
      {type, bag}]),
  rpc:multicall(Nodes, application, stop, [mnesia]).
