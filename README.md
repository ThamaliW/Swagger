<h1>WSO2 Machine Learner REST API Implementation</h1>
<h2>Generating REST API Code  using Swagger Definition</h2>


















Following document discusses implementation details for generating client library using swagger API definition.
</br>
Tools:</br>
	Swagger Codegen
	Swagger Editor
	Maven mojo plugins
	Apache CXF

Procedure:
First step is to generate swagger API specification using swagger editor.
Next step is to create a maven project and add the created swagger specification yaml file to the resources folder.
There are certain dependencies to be added to the POM file.
To generate a war with tomac naming convention use maven-war-plugin with the following.

<plugin>
    <artifactId>maven-war-plugin</artifactId>
    <version>2.2</version>
    <configuration>
        <webResources>
            <resource>
                <!-- this is relative to the pom.xml directory -->
                <directory>src/main/webapp</directory>
            </resource>
        </webResources>
        <warName>api</warName>
    </configuration>
</plugin>


Add the following plugin to generate server stub for CXF.

<plugin>
    <groupId>org.wso2.maven.plugins</groupId>
    <artifactId>swagger2cxf-maven-plugin</artifactId>
    <version>1.0-SNAPSHOT</version>
    <configuration>
        <inputSpec>${project.basedir}/src/main/resources/s.yml</inputSpec>
    </configuration>
</plugin>

Also add the following maven build helper plugin


<plugin>
   <groupId>org.codehaus.mojo</groupId>
   <artifactId>build-helper-maven-plugin</artifactId>
   <version>1.9.1</version>
   <executions>
       <execution>
           <id>add-source</id>
           <phase>generate-sources</phase>
           <goals>
               <goal>add-source</goal>
           </goals>
           <configuration>
               <sources>
                   <source>src/gen/java</source>
               </sources>
           </configuration>
       </execution>
   </executions>
</plugin>

mvn swagger2cxf:generate command is used to generate the server stub

In src/gen/java folder, set of factories are generated and in main/Java folder, a set of impl files are generated. 

The remaining logic should be added to the impl to complete the REST API code

