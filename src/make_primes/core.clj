(ns make-primes.core
  (:use [clojure.pprint]))

;(time 
(defn primes [x]
  (let [prime_quantity x
      n (* prime_quantity prime_quantity)
        smallest_odd 3 ;smallest odd prime, skipping all evens for efficiency
      ]
  ;I use a sorted-set for printing purpose. A transient! hash-set would yield log32n disj vs log2n disj
  (loop [odd_num_list (apply sorted-set (cons 2 (range smallest_odd n 2))) 
       i smallest_odd
       j smallest_odd]
    (cond
      (< (* i j) n)
          (do
            ;(println "i" i (* i j))
            (recur (disj odd_num_list (* i j)) ; disj is log32n faster when a hash-set.
                   (+ 2 i) 
                   j))
      (< j n) ;I need to have to inner loops similar to double/iner for loops, which yields On^2 
          (do
            ;(println (+ 2 j) (get odd_num_list (+ 2 j)))
            ;(println "j recur increase" (+ 2 j))
            (if (get odd_num_list (+ 2 j))
              (recur odd_num_list
                     smallest_odd ;reset i to smallest_odd, since we found another prime
                     (+ 2 j)) ;found j+2 as other prime
              (recur odd_num_list
                     i ;keep i, j+2 isn't a prime checking next odd #
                     (+ 2 j));(+ 2 @y));j 2))
           ))
      :else (take prime_quantity odd_num_list)))
  ))
(def prime_list (primes 10))
                                        ;)
(pprint (for [x (cons 1 prime_list)]
          [(map (partial * x) (cons 1 prime_list))]))

