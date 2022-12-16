# About:

This project to demonstrates leverage of source code generation using [openapi-generator plugin](https://openapi-generator.tech/docs/plugins/) .


# Usage:

- `mvn clean compile` will generate the required controller and DTO model code as per [the spec](./api/sample-api-generator-v1.yaml).
- You can extend and use the generated code as shown [here](./src/main/java/com/techconative/openapispec/blog/restcontroller/UserRestController.java).
