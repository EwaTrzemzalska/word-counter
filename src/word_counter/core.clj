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
  [args]
  ;;TODO if user didn't provide string while running, throw info to provide
  (println (str "Your words count is " (count-words args))))



