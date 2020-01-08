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
  ([] (println "Run your app again with your sentence"))
  ([input] (println (str "Your words count is " (count-words input)))))