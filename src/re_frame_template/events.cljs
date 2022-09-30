(ns re-frame-template.events
  (:require
   [re-frame.core :as re-frame]
   [re-frame-template.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
