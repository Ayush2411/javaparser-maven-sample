// Methods in this file will end up as object methods on the object that load returns.
def call(String whoAreYou = 'human') {
    echo "Look at this, ${whoAreYou}! You loaded this from another file!"
    sh 'pwd'
    sh 'mvn clean install'
}

//return this;
