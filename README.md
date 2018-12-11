# Rest Training Repository for the MiddleWare Course

This repository contains the examples used in class
as well as some relevant tutorials found on-line

In order to avoid confusion, one repository is maintained and 
branches are used to distinguishes different projects.

Master will always refer to an empty project

Students are welcome to open pull-requests and issues
to improve the material.


## Project

- hello-world
    1  j kafa
    2  ..
    3  ls
    4  cat README.md 
    5  cd kafka211/
    6  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
    7  clear
    8  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
    9  cat ../README.md 
   10  clear
   11  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
   12  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --property print.key=true --from-beginning
   13  clear
   14  kafka-topics --zookeeper zookeeper1:2181 \ --create --topic two-p-topic \ --partitions 2 \ --replication-factor 1
   15  bin/kafka-topics --zookeeper zookeeper1:2181 \ --create --topic two-p-topic \ --partitions 2 \ --replication-factor 1
   16  ./bin/kafka-topics --zookeeper zookeeper1:2181 \ --create --topic two-p-topic \ --partitions 2 \ --replication-factor 1
   17  ls
   18  ./bin/kafka-topics.sh --zookeeper zookeeper1:2181 \ --create --topic two-p-topic \ --partitions 2 \ --replication-factor 1
   19  clear
   20  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic test_two_partitions
   21  claer
   22  clear
   23  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions
   24  seq  1 100
   25  clear
   26  seq 1 100 > bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions
   27  seq 1 100 > numlist
   28  celar
   29  clear
   30  seq 1 100 > bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions < numlist 
   31  cat numlist 
   32  clear
   33   bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions < numlist
   34  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_two_partitions --property print.key=true --from-beginning
   35  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_two_partitions --from-beginning
   36  clear
   37  bin/kafka-topics.sh --list --zookeeper localhost:2181
   38   bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions < numlist
   39  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_two_partitions < numlist
   40  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_2p --from-beginning
   41  echo < numlist 
   42  cat numlist 
   43  clear
   44  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_two_partitions 
   45  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic test2p
   46  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test2p < numlist
   47  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test2p
   48  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test2p < numlist 
   49  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   50  clear
   51   bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   52  ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   53  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
   54  ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   55  ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   56  ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   57  j kafka-training
   58  open .
   59  git add .
   60  git commit -m 'slides'
   61  git push origin master 
   62  clear
   63  j kafak2
   64  clear
   65  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   66  jsp
   67  jps
   68  ls
   69  ls
   70  clear
   71  ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   72  bin/kafka-topics.sh --list --zookeeper localhost:2181
   73  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
   74  jps
   75  git status
   76  open .
   77  bin/kafka-topics.sh --list --zookeeper localhost:2181
   78  clear
   79  ./bin/kafka-console-consumer.sh --broker-list localhost:9092 --topic topic1
   80  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic 1-from-beginning
   81  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning
   82  jps
   83  jps
   84  jps
   85  jps
   86  jps
   87  jps
   88  j kafka2
   89  ./bin/zookeeper-server-start.sh config/zookeeper.properties
   90  rm -rf /tmp/zookeeper
   91  rm -rf /tmp/kafka-logs/
   92  ./bin/zookeeper-server-start.sh config/zookeeper.properties
   93  clear
   94  rm -rf /tmp/zookeeper
   95  rm -rf /tmp/kafka-logs/
   96  rm -rf /tmp/kafka-logs
   97  ls /tmp
   98  ls /tmp/
   99  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  100  rm -rf /tmp/kafka-logs
  101  rm -rf /tmp/zookeeper
  102  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  103  rm -rf /tmp/kafka-logs
  104  rm -rf /tmp/zookeeper
  105  kafka2
  106  j kafka2
  107  bin/kafka-server-start.sh config/server.properties
  108  bin/kafka-server-start.sh config/server.properties
  109  clkear
  110  ckear
  111  claer
  112  clear
  113  clkearcat config/server.properties 
  114  clear
  115  bin/kafka-server-start.sh config/server.properties
  116  clear
  117  bin/kafka-server-start.sh config/server.properties
  118  j ICEP
  119  git pull origin master 
  120  git add Figures/
  121  git status
  122  git commit -m 'figures'
  123  git pull origin master 
  124  git pull origin master 
  125  git push origin master 
  126  sublime .
  127  git add Figures/
  128  git commit -m 'figures'
  129  git push origin master 
  130  open .
  131  git pull origin master 
  132  git stash
  133  git pull origin master 
  134  sublime .
  135  git diff introduction.tex
  136  tig
  137  j code
  138  sublime README.md 
  139  j kafak2
  140  bin/kafka-server-start.sh config/server.properties
  141  j kafka
  142  bin/kafka-server-start.sh config/server.properties
  143  j kafka2
  144  ..
  145  ls
  146  cd kafka211/
  147  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  148  rm -rf /tmp/zookeeper
  149  rm -rf /tmp/kafka-logs/
  150  rm -rf /tmp/kafka-logs
  151  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  152  rm -rf /tmp/kafka-logs
  153  rm -rf /tmp/zookeeper
  154  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  155  j kafka
  156  bin/kafka-server-start.sh config/server.properties
  157  j kafaka
  158  cat ../README.md 
  159  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temperature --from-beginning
  160  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temperature2 --from-beginning
  161  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temperature-2-p --from-beginning
  162  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temperature-2-p --property print.key=true --from-beginning
  163  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic temp-2-p
  164  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  165  ksp
  166  jps
  167  jps
  168  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  169  k kafak
  170  j kafk2
  171  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  172  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  173  jps
  174  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  175  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p --property print.key=true --from-beginning
  176  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic temp-2-p
  177  j kafka
  178  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic temp-2-p
  179  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic temp-2-p2
  180  jps
  181  jps
  182  cat ../README.md 
  183  bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
  184  clear
  185  jps
  186  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p2 --property print.key=true --from-beginning
  187  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2-p3 --property print.key=true --from-beginning
  188  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  189  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  190  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  191  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  192  j kafka2
  193  cat ../README.md 
  194  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  195  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  196  rm -rf /tmp/zookeeper
  197  rm -rf /tmp/kafka-logs
  198  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  199  rm -rf /tmp/kafka-logs
  200  rm -rf /tmp/kafka-logs
  201  rm -rf /tmp/zookeeper
  202  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  203  j kwk2
  204  j kafka2
  205  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  206  j kadka
  207  bin/kafka-server-start.sh config/server.properties
  208  bin/kafka-server-start.sh config/server.properties
  209  bin/kafka-server-start.sh config/server.properties
  210  bin/kafka-server-start.sh config/server.properties
  211  j kafka-tra
  212  git status
  213  git reset
  214  git add src/main/java/temperature/
  215  git status
  216  git commit -m 'temperature example'
  217  git push origin master 
  218  git stash
  219  git push origin master 
  220  j kafk
  221  clear
  222  bin/kafka-server-start.sh config/server.properties
  223  bin/kafka-server-start.sh config/server.properties
  224  j kafka
  225  clear
  226  cat ../README.md 
  227  clear
  228  j kafka2
  229  clear
  230  bin/kafka-topics.sh --list --zookeeper localhost:2181
  231  rm =rf 
  232  rm -rf /tmp/zookeeper
  233  rm -rf /tmp/kafka-logs
  234  rm -rf /tmp/kafka-logsclear
  235  clear
  236  clear
  237  clear
  238  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp --property print.key=true --from-beginning
  239  clear
  240  bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic temp-2p
  241  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --from-beginning
  242  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --property print.partion --from-beginning
  243  sublime ./bin/kafka-console-consumer.sh 
  244  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --property --partition temp-2p-0  --from-beginning
  245  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --property --partition temp-2p-1  --from-beginning
  246  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --property --partition 1 --from-beginning
  247  clear
  248  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic temp-2p --property print.key=true --property print.partion=true --from-beginning
  249  j kfak
  250  j kafka
  251  clear
  252  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  253  ./bin/zookeeper-server-start.sh config/zookeeper.properties
  254  j ICEP
  255  git pull origin master 
  256  sublime .
  257  j code
  258  sublime .
  259  sublime .
  260  erlang
  261  erl
  262  erl
  263  erl
  264  erl
  265  erl
  266  sublime .
  267  git status
  268  git add haskell/
  269  git status
  270  sublime README.md 
  271  git add README.md
  272  git commit -m 'applicative and trees'
  273  git push origin master 
  274  cd haskell/
  275  ls
  276  cd prepared/
  277  ls
  278  mkdir ESE20181204
  279  cd ESE20181204/
  280  ls
  281  ls
  282  touch state.hs
  283  sublime .
  284  ghci
  285  ghci
  286  ghci
  287  ghci
  288  ghci
  289  ghci
  290  git add .
  291  git reset
  292  reveal state.hs 
  293  j code
  294  cd haskell/
  295  cd actual/
  296  ls
  297  ghci
  298  clear
  299  ghci
  300  ..
  301  git add .
  302  sublime  ../README.md 
  303  git add ../README.md
  304  git commit -m '[haskell] 2018/12/04\
  305  '
  306  git push  origin master 
  307  j ICEP
  308  sublime .
  309  sublime .
  310  j wasp
  311  j wasp
  312  j wasp
  313  j Onto
  314  cd wasp/
  315  ls
  316  git init
  317  git remote add origin git@github.com:riccardotommasini/wasp-vocab.git
  318  git pull origin m
  319  git pull origin master
  320  git status
  321  git add wasp.owl
  322  git push origin master 
  323  git commit -m 'ontology;
  324  '
  325  git push origin master 
  326  ..
  327  git clone git@github.com:riccardotommasini/w3id.org.git
  328  cd w3id.org/
  329  git remote -v
  330  git remote add w3id https://github.com/perma-id/w3id.org.git
  331  git pull w3id master
  332  git status
  333  git stash
  334  git pull w3id master
  335  git puhs origin master
  336  git push origin master
  337  sublime rsp/
  338  curl -X POST http://localhost:9999/hello
  339  curl -X POST http://localhost:9999/hello
  340  curl  http://localhost:9999/hello
  341  curl  http://localhost:9999/hello
  342  curl -X POST http://localhost:9999/hello
  343  history >> README.md 
