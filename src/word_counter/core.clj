(ns word-counter.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn count-words [sentence]
  (if (string? sentence)
    (-> sentence
        (str/split #" ")
        (->> (filter (fn [word]
                       (not (str/blank? word)))))
        count)
    0))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, it's my word counting app!"))


