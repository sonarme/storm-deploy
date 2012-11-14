(defproject storm-deploy "0.0.6-SNAPSHOT"
  :source-path "src/clj"
  :test-path "test/clj"
  :dev-resources-path "conf"
  :run-aliases {:deploy backtype.storm.provision}
  :main backtype.storm.provision

  :repositories {
                 "sonatype" "https://oss.sonatype.org/content/repositories/releases"
                 "jclouds-snapshot" "https://oss.sonatype.org/content/repositories/snapshots"
                 }

  :dependencies [
                 [org.clojure/clojure "1.3.0"]
                 [storm "0.8.1"]
                 [commons-codec "1.4"]
                 [org.cloudhoist/pallet "0.7.2"]
                 [org.cloudhoist/pallet-jclouds "1.4.2"]
                 [org.cloudhoist/java "0.7.2-SNAPSHOT"]
                 [org.cloudhoist/git "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/ssh-key "0.5.0"]
                 [org.cloudhoist/automated-admin-user "0.5.0"]
                 [org.cloudhoist/iptables "0.7.2-SNAPSHOT"]
                 [org.cloudhoist/maven "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/zookeeper "0.5.1"]
                 [org.cloudhoist/nagios "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/crontab "0.5.1-SNAPSHOT"]

                 [org.jclouds.driver/jclouds-sshj "1.4.2"]
                 [org.jclouds.provider/aws-ec2 "1.4.2"]
                 [org.jclouds.provider/aws-s3 "1.4.2"]

                 [org.clojure/tools.cli "0.2.2"]
                 [log4j/log4j "1.2.14"]
                 [jvyaml "1.0.0"]]

  :dev-dependencies [
;                 [swank-clojure "1.4.2"]
                 [org.cloudhoist/pallet-lein "0.5.2"]
                 ]
  )


