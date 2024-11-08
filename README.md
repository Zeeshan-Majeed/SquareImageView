# Square ImageView

Sqaure ImageView is like simple imageview, cool thing is width is always equal to height
> eg: width is 100dp height will automatically 100dp, no matter wat was original height
> It have ImageFilterView properties
>

## Getting Started

### Step 1:
Add it in your root build.gradle at the end of repositories:

For Groovy DSL
```kotlin 

    dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 
```

For Kotlin DSL
```kotlin 

    dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven {
				url = uri("https://jitpack.io")
			}
		}
	}
 
```


### Step 2:
Add the dependency

version: [![](https://jitpack.io/v/Zeeshan-Majeed/SquareImageView.svg)](https://jitpack.io/#Zeeshan-Majeed/SquareImageView)

```kotlin 

    dependencies {
	        implementation("com.github.Zeeshan-Majeed:SquareImageView:version")
	}
 
```

>
>That's it
