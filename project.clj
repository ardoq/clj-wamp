(defproject clj-wamp "1.0.3"
  :description "The WebSocket Application Messaging Protocol for Clojure"
  :url "https://github.com/ardoq/clj-wamp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.clojure/data.codec "0.1.1"]
                 [http-kit "2.1.18"]
                 [cheshire "5.8.0"]]
  :profiles {:1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :dev {:dependencies [[log4j "1.2.17" :exclusions [javax.mail/mail
                                                               javax.jms/jms
                                                               com.sun.jdmk/jmxtools
                                                               com.sun.jmx/jmxri]]]}})
