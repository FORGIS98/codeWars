findOutLiner :: [Int] -> Int
findOutLiner xs = if length (evens xs) == 1 then evens xs !! 0 else odds xs !! 0

evens xs = [x | x <- xs, x `mod` 2 == 0]
odds xs = [x | x <- xs, x `mod` 2 /= 0]
