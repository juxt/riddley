(defproject pro.juxt.clojars-mirrors.ztellman/riddley "0.2.0"
  :description "code-walking without caveats (mirrored from Clojars by JUXT)"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :url "https://github.com/ztellman/riddley"
  :scm {:name "git"
        :url "https://github.com/juxt/riddley"
        :dir "."}
  :dependencies []

  :plugins [[lein-codox "0.9.4"]]
  :codox {:src-dir-uri "https://github.com/ztellman/riddley/tree/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}
          :include [riddley.walk riddley.compiler]
          :output-dir "doc"}
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  :java-source-paths ["src"]
  :javac-options ["-target" "1.6" "-source" "1.6"]

  ;; empty JARs to keep Maven Central happy
  :classifiers {:sources {:jar-exclusions [#""]}
                :javadoc {:jar-exclusions [#""]}}

  :pom-addition ([:developers
                  [:developer
                   [:id "ztellman"]
                   [:name "Zach Tellman"]]
                  [:developer
                   [:id "juxt"]
                   [:name "JUXT"]
                   [:roles [:role "packager"]]]])

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}})
