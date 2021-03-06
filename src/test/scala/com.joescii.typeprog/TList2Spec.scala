package com.joescii.typeprog

object TList2Spec {
  type Nat1 = NatN[Nat0]
  type Nat2 = NatN[Nat1]
  type Nat3 = NatN[Nat2]
  type Nat6 = NatN[NatN[NatN[Nat3]]]

  type L = Nat1 :: Nat2 :: Nat3 :: TNil
  implicitly[L#reduce =:= Nat6]
}
