(ns frontend.main.core
  (:require [reagent.core :as r]
            ["react-dom/client" :as rdom]))

(defonce app-state
  (r/atom
   {:title "Scratch App"}))

;; Reagent components

(defn title []
  [:h1 (:title @app-state)])

(defn app []
  [:div {:class "app"}
   [title]])

(defn ^:dev/after-load start []
  (js/console.log "Start")
  (.render (rdom/createRoot (js/document.getElementById "app"))
           (r/as-element [app])))

(defn ^:export init []
  (js/console.log "Initialize")
  (start))
