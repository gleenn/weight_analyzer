(ns weight-analyzer.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [weight-analyzer.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[weight_analyzer started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[weight_analyzer has shut down successfully]=-"))
   :middleware wrap-dev})
