**build aar**
```shell

./gradlew :hellolibrary:assembleRelease
mkdir -p app/libs
cp hellolibrary/build/outputs/aar/hellolibrary-release.aar app/libs/

```