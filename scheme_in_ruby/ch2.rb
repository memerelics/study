# encoding: utf-8
require './eval'

exp = [[:lambda, [:x, :y], [:+, :x, :y]], 3, 2]
# puts $global_env
# {:+=>[:prim, #<Proc:0x007fb53c8255e8@/Users/hash/work/study/scheme_in_ruby/eval.rb:30 (lambda)>], :-=>[:prim, #<Proc:0x007fb53c825598@/Users/hash/work/study/scheme_in_ruby/eval.rb:31 (lambda)>], :*=>[:prim, #<Proc:0x007fb53c825548@/Users/hash/work/study/scheme_in_ruby/eval.rb:32 (lambda)>]}
puts _eval(exp, $global_env)


# λ式 => 単なるコード
# クロージャ => λ式と, それを評価した時の環境

# λ式が扱える = 関数を値として扱える = 高階関数がある
# クロージャは高階関数よりもさらに強力
