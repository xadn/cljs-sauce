(ns cljs-sauce.core)

(defn ^:export foo
  "I don't do a whole lot."
  [x]
  (.log js/console x "Hello, World!"))


