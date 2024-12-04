# Learning Android Development

![img.png](.github-media/img.png)



So far: 
- Basics of Kotlin
- Basics of Android Development
- Basics of Jetpack compose
  - @Composable functions
  - Previewing Components / @Composable functions
  - Basic building blocks `Box`, `Row`, `Column` , `Text`
  - Using Images in Jetpack compose
  - Extracting application wide Strings as resources and into de res/values folder.
  - First "interactive" Composable (see DiceRoller.kt)
  - Starting up with `Modifiers` (argumentos para decorar y dar funcionalidad a componentes )
  - Added auto documentation. Generating in [Docs](docs/index.html)
  - Created `ComposablesReference.kt` which is aimed to have a summary of the most important @Composable functions readily available as reference (e.g., Text, Spacer, Surface, InputText, TextField)
  - Created `TipCalculator` a super simple application showcasing Composability and State use at different levels.
    - Implemented extension of `TipCalculator` to make things tip percentage configurable and possibility to round the amount.
    - Introduced a @Composable function `Switch` to implement the toggle functionality for Rounding the amount.
    - Added scrollbar to support landscape mode.
  
- Basics of testing: 
  - Unit tests go in the `/app/test/...package name dir` : are run locally without extra hassle
  - Instrumentation / UI tests go in the `app/androidTest/...package name dir` : these generate a build and run the app

# Generating the documentation

`./gradlew dokkaHtml --no-build-cache --rerun-tasks`



# Showcase

## Images 
![ImagesActivity.png](.github-media/ImagesActivity.png)

## Dice Roller
![DiceRoller.gif](.github-media/DiceRoller.gif)


## Tip Calculator
![TipCalculator.gif](.github-media/TipCalculator.gif)