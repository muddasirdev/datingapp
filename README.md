# Dating App UI Prototype

A Kotlin Android application prototype focused on onboarding and discovery screen layouts. The repository is useful as a UI starting point; it does not implement a complete dating service.

## Screens and code present

The project includes layouts and fragments for splash/onboarding, login, sign-up, profile setup, location setup, nearby discovery, and chat presentation. Navigation is built with AndroidX Navigation and the UI uses Android Views with XML layouts and View Binding.

Some fragments currently only inflate their layout. In particular, the nearby discovery and sign-up screens do not implement real account creation or matching behavior. The project has no server, persistent user database, production authentication, messaging transport, or implemented matching service.

## Technology

- Kotlin
- Android Views and XML layouts
- View Binding
- AndroidX Navigation
- Google Maps dependency in the Android build

## Project layout

- `app/src/main/java` — activity, fragments, and app navigation
- `app/src/main/res/layout` — screen layouts
- `app/src/main/res/navigation` — navigation graph
- `app/src/main/res/drawable` — UI artwork and icons
- `app/build.gradle` — SDK configuration and dependencies

## Requirements

- Android Studio and a compatible JDK
- Android SDK
- Android device or emulator running Android 5.0 / API 21 or later

## Run

Open the project in Android Studio, sync Gradle, then run the `app` configuration on a device or emulator.

From a shell:

```sh
./gradlew assembleDebug
```

On Windows:

```bat
gradlew.bat assembleDebug
```

No successful build is claimed here. Google Maps features require appropriate Maps configuration if those screens are developed to use the Maps SDK.

## Status and next development work

This is a client-side UI prototype. Real client functionality would require implementing and securing authentication, profile storage, location permission and consent flows, discovery/matching rules, chat delivery, moderation, and a backend API. Do not present the current repository as a deployed or production-ready dating platform.

## License

No license file is included. Contact the repository owner before reusing or distributing the code.
