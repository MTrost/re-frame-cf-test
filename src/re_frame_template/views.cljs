(ns re-frame-template.views
  (:require
   [re-frame.core :as re-frame]
   [re-frame-template.subs :as subs]
   ))


(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     ]))
