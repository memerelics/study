module MathSpec where

import Test.Hspec.Monadic
import Math

main = hspecX $ do
  describe "absolute" $ do
    it "returns the original number when given a positive input" $
      absolute 1 == 1

    it "returns a positive number when given a negative input" $
      absolute (-1) == 1

    it "returns zero when given zero" $
      absolute 0 == 0
