## Example of Mobile First Foundation Adapter

- Uses Pojos for JAXRS interfaces
- Some of te POJOs use @JsonProperty to define custom json key mappings
- Adapter can be build and deployed to an MFF instance but POJOs with @JsonProperty are not properly mapped.
- Swagger documentation is also not correct yet. It ignores the @JsonProperty.
