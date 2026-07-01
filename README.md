# spring-boot-crud-h2
Spring Boot CRUD application with H2 database

brew install h2

h2 -url "jdbc:h2:mem:testdb" -user sa -password ""


brew install openjdk@17     

to verify if java 17 is installed
ls /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home    

To set java path
export JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:$PATH"    
echo $JAVA_HOME    
