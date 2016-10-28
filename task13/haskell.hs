eps = 0.00001
sqrt_n y = if y >= 0 
    then a (0.5 * y)
    else undefined 
        where
             a k
                      |abs (k * k - y) < eps = k
                      |otherwise = a (0.5 * (k + y / k))





count_digits n 
                | n < 10 = 1
                | otherwise = 1 + count_digits (n `div` 10)
                      
sum_digits n 
                | n < 10 = n
                | otherwise = (n `mod` 10) + sum_digits ( n `div` 10)
