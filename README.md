# Firefly Framework - R2DBC

[![CI](https://github.com/fireflyframework/fireflyframework-r2dbc/actions/workflows/ci.yml/badge.svg)](https://github.com/fireflyframework/fireflyframework-r2dbc/actions/workflows/ci.yml)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-21%2B-orange.svg)](https://openjdk.org)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green.svg)](https://spring.io/projects/spring-boot)

> Reactive database access module with R2DBC, pagination, filtering, and Swagger integration for Spring Boot applications.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Quick Start](#quick-start)
- [Configuration](#configuration)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

## Overview

Firefly Framework R2DBC provides reactive database connectivity using Spring Data R2DBC with PostgreSQL. It includes auto-configuration for R2DBC connections, transaction management, and a set of utility classes for pagination and dynamic filtering.

The module also bundles Swagger/OpenAPI configuration for documenting reactive API endpoints, and provides reusable filter utilities that enable dynamic query construction based on request parameters.

This module is typically used by domain and data-layer microservices that require non-blocking database access.

## Features

- Spring Data R2DBC auto-configuration with PostgreSQL
- Reactive transaction management via `R2dbcTransactionConfig`
- `PaginationRequest` / `PaginationResponse` utilities for standardized pagination
- `FilterRequest` and `FilterUtils` for dynamic query filtering
- `RangeFilter` for range-based query parameters
- `@FilterableId` annotation support via `FilterParameterCustomizer`
- Swagger/OpenAPI configuration for WebFlux endpoints
- Spring Boot auto-configuration via `AutoConfiguration.imports`

## Requirements

- Java 21+
- Spring Boot 3.x
- Maven 3.9+
- PostgreSQL database

## Installation

```xml
<dependency>
    <groupId>org.fireflyframework</groupId>
    <artifactId>fireflyframework-r2dbc</artifactId>
    <version>26.02.06</version>
</dependency>
```

## Quick Start

```java
import org.fireflyframework.core.queries.PaginationRequest;
import org.fireflyframework.core.queries.PaginationResponse;

@RestController
public class ProductController {

    @GetMapping("/products")
    public Mono<PaginationResponse<Product>> list(PaginationRequest pagination) {
        return productService.findAll(pagination);
    }
}
```

## Configuration

```yaml
spring:
  r2dbc:
    url: r2dbc:postgresql://localhost:5432/mydb
    username: user
    password: secret
```

## Documentation

No additional documentation available for this project.

## Contributing

Contributions are welcome. Please read the [CONTRIBUTING.md](CONTRIBUTING.md) guide for details on our code of conduct, development process, and how to submit pull requests.

## License

Copyright 2024-2026 Firefly Software Solutions Inc.

Licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE) for details.
