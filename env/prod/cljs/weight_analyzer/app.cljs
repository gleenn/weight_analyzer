(ns weight-analyzer.app
  (:require [weight-analyzer.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
