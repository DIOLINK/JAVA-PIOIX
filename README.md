# 📚 Ejers - Colección de Ejercicios Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

## 📖 Descripción

Este proyecto contiene una colección de ejercicios de programación en Java desarrollados por **Roger Coverzola Bogado**. Los ejercicios cubren diferentes conceptos fundamentales de programación como validación de entrada, bucles, condicionales y manejo de datos.

## 🚀 Características

- ✅ **7 ejercicios diferentes** de programación
- 🔧 **Utilidades comunes** para manejo de entrada de usuario
- 📦 **Proyecto Maven** con dependencias configuradas
- 🎯 **Código limpio** y bien documentado
- 🔄 **Manejo de errores** y validaciones

## 📋 Lista de Ejercicios

### 1. 🎂 HowOldAreYou
**Validación de edad y determinación de mayoría de edad**
- Solicita la edad del usuario
- Valida que la edad esté en un rango válido (0-150)
- Determina si es mayor o menor de edad (18 años)

### 2. 🔐 ValidateStorePass
**Sistema de validación de contraseñas**
- Almacena un conjunto de contraseñas válidas
- Permite al usuario intentar ingresar una contraseña
- Valida la contraseña ingresada contra las almacenadas

### 3. ➗ Divide
**Calculadora de división**
- Realiza operaciones de división entre dos números
- Maneja casos especiales de división

### 4. 🔢 UnivenOrPair
**Determinación de números pares e impares**
- Recibe un número del usuario
- Determina si el número es par o impar

### 5. 💰 AgeTaxAction
**Cálculo de impuestos basado en edad**
- Calcula impuestos considerando la edad del usuario
- Aplica diferentes tasas según criterios de edad

### 6. ➕ SumNumber
**Suma de números**
- Realiza operaciones de suma con números ingresados por el usuario

### 7. 🔢 SumAllNum
**Suma acumulativa de números**
- Permite ingresar múltiples números positivos
- Suma todos los números ingresados
- Termina cuando se ingresa un número negativo

## 🛠️ Tecnologías Utilizadas

- **Java 24** - Lenguaje de programación principal
- **Maven** - Gestión de dependencias y construcción
- **Jakarta XML Bind** - Para manejo de XML
- **JSON Smart** - Para procesamiento de JSON

## 📦 Instalación y Configuración

### Prerrequisitos
- ☕ Java 24 o superior
- 🔧 Maven 3.6 o superior
- 💻 IDE compatible (NetBeans, IntelliJ IDEA, Eclipse)

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/DIOLINK/JAVA-PIOIX.git
   cd Ejers
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean compile
   ```

3. **Ejecutar el proyecto**
   ```bash
   mvn exec:java
   ```

## 🎮 Cómo usar

1. **Ejecuta la clase principal** `Ejers.java`
2. **Descomenta el ejercicio** que deseas probar en el método `main()`
3. **Comenta los demás ejercicios** para evitar conflictos
4. **Ejecuta el programa** y sigue las instrucciones en pantalla

### Ejemplo de uso:
```java
// Para ejecutar el ejercicio de validación de edad
HowOldAreYou user = new HowOldAreYou();
user.ask();
```

## 📁 Estructura del Proyecto

```
📦 Ejers/
├── 📄 pom.xml                          # Configuración de Maven
├── 📁 src/
│   └── 📁 main/
│       └── 📁 java/
│           └── 📁 com/
│               ├── 📁 rcoverzola/
│               │   └── 📁 ejers/
│               │       ├── 🎯 Ejers.java              # Clase principal
│               │       ├── 🎂 HowOldAreYou.java       # Validación de edad
│               │       ├── 🔐 ValidateStorePass.java  # Validación de contraseñas
│               │       ├── ➗ Divide.java             # Calculadora de división
│               │       ├── 🔢 UnivenOrPair.java       # Números pares/impares
│               │       ├── 💰 AgeTaxAction.java       # Cálculo de impuestos
│               │       ├── ➕ SumNumber.java          # Suma de números
│               │       └── 🔢 SumAllNum.java          # Suma acumulativa
│               └── 📁 util/
│                   └── 🛠️ ProgramUtil.java           # Utilidades comunes
└── 📁 target/                          # Archivos compilados
```

## 👨‍💻 Autor

**Roger Coverzola Bogado**
- 📧 Email: [roger.bogado.coverzola@gmail.com]
- 💼 LinkedIn: [[linkedin](https://www.linkedin.com/in/roger-c-77a27a192/?locale=en_US)]
- 🐙 GitHub: [https://github.com/DIOLINK]

## 📝 Licencia

Este proyecto está bajo la Licencia por defecto de NetBeans. Ver el archivo de licencia para más detalles.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. 🍴 Fork el proyecto
2. 🌿 Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push a la rama (`git push origin feature/AmazingFeature`)
5. 🔄 Abre un Pull Request

## 📊 Estadísticas del Proyecto

- 📁 **8 clases Java**
- 📝 **~500 líneas de código**
- 🎯 **7 ejercicios funcionales**
- 🔧 **1 clase de utilidades**

---

⭐ **¡Si te gusta este proyecto, no olvides darle una estrella!** ⭐
