-- True, False 以外は Boolean 型ではない. 1や0をBooleanの文脈で評価するとエラー.
-- "it" はghciで直前に評価した式の結果.
--     Prelude> "foo"
--     "foo"
--     Prelude> it ++ "bar"
--     "foobar"
--     Prelude> :type it
--     it :: [Char]


-- 文字'', 文字列"". 文字列は文字のリスト.
--     Prelude> 'a':"bcd"
--     "abcd"
--     Prelude> 'a':'bcd'
--     <interactive>:7:5:
--         Syntax error on 'bcd'
--         Perhaps you intended to use -XTemplateHaskell

Prelude> "a"++"bcd"
"abcd"


評価の後に型を表示するghciの設定.

Prelude> :set +t
Prelude> "foo"
"foo"
it :: [Char]
Prelude> 88
88
it :: Integer

-- itは最後に評価されたアレ.

Prelude > :m +Data.Ratio -- Module loadの短縮形

Prelude Data.Ratio> 11 / 20
0.55
it :: Double
Prelude Data.Ratio> 11 % 29
11 % 29
it :: Ratio Integer


-- Int 2^32-1... 最適化されているので速い
-- Integer 大きさ無制限

succ 'a' -- 次の値.
pred 'b' -- 前の値.

Prelude> :t 2 + 3
2 + 3 :: Num a => a
Prelude> 2 + 3
5
it :: Integer
Prelude> :t it
it :: Integer

truncate -- 切り捨て
floor, ceiling


-- ghci tips
:show bindings


-- lines: 文字列を受け取って改行で分解
-- words: 文字列を受け取って空白で分解


