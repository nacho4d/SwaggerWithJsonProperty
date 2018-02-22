## Example of Mobile First Foundation Adapter

- Uses Pojos for JAXRS interfaces
- Some of te POJOs use @JsonProperty to define custom json key mappings
- Build and deploy with maven: `mvn clean install adapter:deploy`
- Adapter can be build and successfully deployed to an MFF instance but POJOs with @JsonProperty.
- Swagger documentation is correct now. It obeys @JsonProperty :)

```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-annotations</artifactId>
    <version>2.9.4</version>
    <scope>provided</scope> <!-- It MUST be provided to work!  -->
</dependency>
```
