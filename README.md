# overview
API Demo App for Regional preferences feature. (OS14+)<br>
[official document](https://developer.android.com/about/versions/14/features#regional-preferences)<br>

# setup
To use the LocalePreferences class, you need to add the `androidx.core:core` library to your project.<br>
see: https://github.com/LeoAndo/android14-regional-preferences-samples/blob/main/APIDemoKotlinApp/app/build.gradle#L45

# For Java Project Problem

Using `androidx.core:core:1.12.0-alpha03` causes kotlin module error. I have to wait for the library update.<br>
```
Duplicate class kotlin.collections.jdk8.CollectionsJDK8Kt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.internal.jdk7.JDK7PlatformImplementations found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.internal.jdk8.JDK8PlatformImplementations found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.io.path.ExperimentalPathApi found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.io.path.PathRelativizer found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.io.path.PathsKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.io.path.PathsKt__PathReadWriteKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.io.path.PathsKt__PathUtilsKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.jdk7.AutoCloseableKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk7-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.0)
Duplicate class kotlin.jvm.jdk8.JvmRepeatableKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.random.jdk8.PlatformThreadLocalRandom found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.streams.jdk8.StreamsKt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1 found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2 found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3 found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4 found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.text.jdk8.RegexExtensionsJDK8Kt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)
Duplicate class kotlin.time.jdk8.DurationConversionsJDK8Kt found in modules kotlin-stdlib-1.8.10 (org.jetbrains.kotlin:kotlin-stdlib:1.8.10) and kotlin-stdlib-jdk8-1.6.0 (org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0)

Go to the documentation to learn how to Fix dependency resolution errors.

```

# Logcat: Changed TemperatureUnit
```
2023-05-09 08:40:14.669 16522-16522 TAG                     com.leoleo.apidemokotlinapp          D  onReceive: packageName= null
                                                                                                    localeList= null
                                                                                                    getHourCycle= h12
                                                                                                    getCalendarType= gregorian
                                                                                                    getCalendarType= gregorian
                                                                                                    getTemperatureUnit= celsius
                                                                                                    getFirstDayOfWeek= sun
```

# Logcat: Changed First Day of Week
```
2023-05-09 08:40:32.804 16522-16522 TAG                     com.leoleo.apidemokotlinapp          D  onReceive: packageName= null
                                                                                                    localeList= null
                                                                                                    getHourCycle= h12
                                                                                                    getCalendarType= gregorian
                                                                                                    getCalendarType= gregorian
                                                                                                    getTemperatureUnit= celsius
                                                                                                    getFirstDayOfWeek= tue
```


# capture: Resizable (Experimental) API UpsideDownCake

[1234.webm](https://user-images.githubusercontent.com/16476224/236959866-ff666714-fe4b-4114-8723-794ac12ad4e7.webm)
