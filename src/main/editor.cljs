(ns editor
  (:require
   [net.eighttrigrams.cljs-text-editor.editor :as editor]))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (js/console.log "start"))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (let [el (.getElementById js/document "textarea")]
    (editor/create el {}))
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
