(ns ordinance-test
  (:require [ordinance :refer :all]
            [clojure.test :refer :all]))

(deftest convert-os-to-lat-lng
  (is (= {:lat 53.92841973569944, :lng -2.174550158805134}
         (os2latlng ["388635" "448046"])))
  (is (= {:lat 53.92841973569944, :lng -2.174550158805134}
         (os2latlng [388635 448046]))))
