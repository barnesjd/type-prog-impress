val sum = (1 :: 2 :: VNil) + (3 :: 4 :: VNil)
sum should equal (4 :: 6 :: VNil)

illTyped("(1 :: 2 :: VNil) + (5 :: VNil)")