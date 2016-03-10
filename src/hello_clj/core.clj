(ns hello-clj.core
  (:gen-class))

(defn greet [who] (println (str "Hello " who "!")))
(defn -main [who] (greet who))

;(defn foo
;  "I don't do a whole lot."
;  [x]
;  (println x "Hello, World!"))
