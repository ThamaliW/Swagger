<h1>WSO2 Machine Learner REST API Implementation</h1>
<h2>Generating REST API Code  using Swagger Definition</h2>


















Following document discusses implementation details for generating client library using swagger API definition.
</br>
Tools:</br>
	Swagger Codegen</br>
	Swagger Editor</br>
	Maven mojo plugins</br>
	Apache CXF</br></br>

Procedure:</br>
First step is to generate swagger API specification using swagger editor.</br>
Next step is to create a maven project and add the created swagger specification yaml file to the resources folder.</br>
There are certain dependencies to be added to the POM file.</br>
To generate a war with tomac naming convention use maven-war-plugin.</br></br>

mvn swagger2cxf:generate command is used to generate the server stub</br>

In src/gen/java folder, set of factories are generated and in main/Java folder, a set of impl files are generated.</br> 

The remaining logic should be added to the impl to complete the REST API code</br>

