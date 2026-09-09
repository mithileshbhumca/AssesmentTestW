# WiproAssesment - Android Project

A modern Android application demonstrating Clean Architecture, MVVM, and the latest Jetpack libraries. This project fetches and displays a list of products from a remote API.

## Project Description
This project is built as a technical assessment to showcase best practices in Android development, including:
- **Clean Architecture:** Separation of concerns into Data, Domain, and UI layers.
- **MVVM Pattern:** Using ViewModels to manage UI state and handle business logic.
- **Modern UI:** Built entirely with Jetpack Compose.
- **Dependency Injection:** Hilt (Dagger) for managing object lifecycles and testing.

## Tech Stack
- **Kotlin:** Primary language.
- **Jetpack Compose:** Declarative UI toolkit.
- **Retrofit & OkHttp:** Networking and API consumption.
- **Hilt:** Dependency Injection.
- **Coil:** Image loading and caching.
- **Coroutines & Flow:** Asynchronous programming and reactive data streams.

## Project Structure
```text
app/src/main/java/com/example/wiproassesment/
├── data/
│   ├── mapper/      # Mapping DTOs to Domain models
│   ├── remote/      # API definitions and DTOs
│   └── repository/  # Repository implementations
├── domain/
│   ├── model/       # Pure business models
│   ├── repository/  # Repository interfaces
│   └── usecases/     # Business logic units (UseCases)
├── di/              # Hilt Modules (Network, Repository)
└── ui/
    ├── navigation/  # Navigation Host and Routes
    ├── products/    # Product list screen, ViewModel, and items
    └── theme/       # Design system (Color, Type, Theme)
```

## API Documentation
The project consumes data from the following source:
- **Base URL:** [https://dummyjson.com/](https://dummyjson.com/)
- **Endpoint:** `/products` (Used to fetch the product catalog)

## Getting Started
1. Clone the repository.
2. Open the project in Android Studio (Ladybug or newer).
3. Build and run the `:app` module on an emulator or physical device.
