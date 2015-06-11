(ns concur.core)

(defn between-0-and-5?
  [val]
  (and (<= 0 val) (>= 5 val)))

(def customers (atom 0 :validator between-0-and-5?))

(defn set-up-barber-shop
  [number-of-customers]
  (reset! customers number-of-customers))

(defn number-of-customers
  []
  @customers)

(defn add-customer
  []
  (try
  (swap! customers inc)
    (println "Customer entered the barber shop and is waiting to be served")
    (catch IllegalStateException e
      (println "Customer left since the barber shop is full"))))

(defn cut-hair
  []
  (while (< 0 @customers)
    (swap! customers dec)
    (println "Cutting a customers hair")
    (Thread/sleep 1)))