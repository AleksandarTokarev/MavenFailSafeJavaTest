# MavenFailSafeJavaTest
Reusing Spring Context in Several Tests Classes


If your Spring application has a problem with the Context restarting on each Test class - you need to reuse Forks
"<reuseForks> true </reuseForks>" in your failsafe configuration.

Also since the tests here are run with "mvn verify -P itest" - the itest profile - the tests will be run 2 times.

First time by surefire, and second time by failsafe plugin. To disable running tests by surefire - use the following plugin configuration

<plugin>
    
    <groupId>org.apache.maven.plugins</groupId>
    
    <artifactId>maven-surefire-plugin</artifactId>
    
    <configuration>
    
        <skip>true</skip>
        
        <testFailureIgnore>true</testFailureIgnore>
        
    </configuration>
    
</plugin>
