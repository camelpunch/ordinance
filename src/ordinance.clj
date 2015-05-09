(ns ordinance
  (:import [uk.me.jstott.jcoord OSRef]))

(defn os2latlng [[x y]]
  (let [osref (OSRef. (Float. (str x)) (Float. (str y)))
        latlng (doto (.toLatLng osref) .toWGS84)]
    {:lat (.getLat latlng)
     :lng (.getLng latlng)}))
