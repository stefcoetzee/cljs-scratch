(ns frontend.main.core
  (:require [reagent.core :as r]
            ["react-dom/client" :as rdom]))

(defonce app-state
  (r/atom
   {:title "My scratch app"}))

;; Reagent components

(defn title []
  [:h1 {:class "font-medium"}
   (:title @app-state)])

(defn app []
  [:div {:class "bg-gray-100 h-screen flex place-items-center justify-center"}
   [title]])

(defn ^:dev/after-load start []
  (js/console.log "Start")
  (.render (rdom/createRoot (js/document.getElementById "app"))
           (r/as-element [app])))

(defn ^:export init []
  (js/console.log "Initialize")
  (start))

(comment
  (swap! app-state assoc :title "App title")
  (start))
