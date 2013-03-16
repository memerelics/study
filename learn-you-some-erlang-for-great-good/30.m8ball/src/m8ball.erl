-module(m8ball).
-behavior(application).
-export([start/2, stop/1]).
-export([ask/1]).

%%%%%%%%%%%%%%%%%
%%% CALLBACKS %%%
%%%%%%%%%%%%%%%%%
start(normal, []) ->
  m8ball_sup:start_link();
%% ���UOTP�A�v���P�[�V�����ɂ���ɂ�, takeover�̎󂯎�����p��
start({takeover, _OtherNode}, []) ->
  m8ball_sup:start_link().

stop(_State) ->
  ok.

%%%%%%%%%%%%%%%%%
%%% INTERFACE %%%
%%%%%%%%%%%%%%%%%
ask(Question) ->
  m8ball_server:ask(Question).

%% 次に.appファイル...これはebin以下に置くよ
