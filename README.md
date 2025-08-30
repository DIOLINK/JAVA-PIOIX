# 🐍 Ejercicios Python - Colección de Programas

![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![Python 3](https://img.shields.io/badge/Python-3.6+-blue?style=for-the-badge&logo=python&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📖 Descripción

Este proyecto contiene una colección de ejercicios de programación en Python desarrollados por **Roger Coverzola Bogado**. Los ejercicios son la transcripción de programas TypeScript a Python, incluyendo una variedad de ejercicios de programación que cubren conceptos fundamentales como validación de entrada, bucles, condicionales y manejo de datos.

## 🚀 Características

- ✅ **7 ejercicios diferentes** de programación
- 🔧 **Clase utilitaria común** (`ProgramUtil`) para funcionalidad compartida
- 🎯 **Código modular** con clases independientes
- 🔄 **Manejo de errores** y validaciones robustas
- 🖥️ **Interfaz interactiva** con menú principal
- 📦 **Arquitectura orientada a objetos** con herencia

## 📋 Lista de Ejercicios

### 1. 🎂 HowOldAreYou
**Verificación de edad y determinación de mayoría de edad**
- Valida edad entre 0 y 150 años
- Determina si es mayor o menor de 18 años
- Manejo de errores para entradas inválidas

### 2. 🔐 ValidateStorePass
**Sistema de validación de contraseñas almacenadas**
- Valida contraseñas contra una lista predefinida
- Comparación case-insensitive
- Bucle hasta encontrar contraseña correcta

### 3. ➗ Divide
**Calculadora de división con validación**
- División de dos números con validación
- Previene división por cero
- Opción de continuar o salir

### 4. 🔢 UnivenOrPair
**Determinación de números pares e impares**
- Determina si un número es par o impar
- Validación de entrada numérica
- Opción de continuar o salir

### 5. 💰 AgeTaxAction
**Cálculo de impuestos basado en edad e ingresos**
- Calcula edad a partir de fecha de nacimiento
- Ingreso de ingresos mensuales
- Determina si debe tributar (ingresos > 1,000,000)

### 6. ➕ SumNumber
**Suma de números consecutivos**
- Suma números consecutivos desde 1 hasta N
- Validación de números positivos
- Salida con cero

### 7. 🔢 SumAllNum
**Suma acumulativa de números positivos**
- Suma todos los números positivos ingresados
- Salida con número negativo
- Acumulador de suma

## 🛠️ Tecnologías Utilizadas

- **Python 3.6+** - Lenguaje de programación principal
- **datetime** - Para cálculos de fechas en AgeTaxAction
- **OOP** - Programación orientada a objetos con herencia
- **Exception Handling** - Manejo de excepciones con try/except

## 📦 Instalación y Configuración

### Prerrequisitos
- 🐍 Python 3.6 o superior
- 💻 Terminal o línea de comandos
- 📝 Editor de código (opcional)

### Pasos de instalación

1. **Clonar o descargar el proyecto**
   ```bash
   # Si tienes git configurado
   git clone [URL_DEL_REPOSITORIO]
   cd class
   ```

2. **Verificar la instalación de Python**
   ```bash
   python3 --version
   # o
   python --version
   ```

3. **Ejecutar el proyecto**
   ```bash
   python3 Ejers.py
   ```

## 🎮 Cómo usar

### Ejecutar el menú principal (recomendado)
```bash
python3 Ejers.py
```

### Ejecutar programas individuales
```bash
# Verificar edad
python3 HowOldAreYou.py

# Validar contraseña
python3 ValidateStorePass.py

# División de números
python3 Divide.py

# Verificar par/impar
python3 UnivenOrPair.py

# Cálculo de impuestos
python3 AgeTaxAction.py

# Suma de números consecutivos
python3 SumNumber.py

# Suma de todos los números
python3 SumAllNum.py
```

### Flujo de uso:
1. 🚀 Ejecuta `python3 Ejers.py` para iniciar el menú principal
2. 📋 Selecciona el número del programa que deseas ejecutar
3. 📝 Sigue las instrucciones en pantalla para cada programa
4. 🚪 Selecciona 0 para salir

## 📁 Estructura del Proyecto

```
📦 class/
├── 📄 README.md                    # Este archivo
├── 🎯 Ejers.py                     # Menú principal
├── 🎂 HowOldAreYou.py              # Verificación de edad
├── 🔐 ValidateStorePass.py         # Validación de contraseñas
├── ➗ Divide.py                    # División de números
├── 🔢 UnivenOrPair.py              # Verificación par/impar
├── 💰 AgeTaxAction.py              # Cálculo de impuestos
├── ➕ SumNumber.py                 # Suma de números consecutivos
├── 🔢 SumAllNum.py                 # Suma de todos los números
├── 🛠️ ProgramUtil.py               # Clase utilitaria base
└── 📁 __pycache__/                 # Archivos compilados de Python
```

## 💡 Características Técnicas

- **Python 3**: Código moderno y legible
- **Modular**: Cada programa es una clase independiente
- **Interactivo**: Interfaz de consola con menú principal
- **Reutilizable**: Clase base `ProgramUtil` para funcionalidad común
- **Manejo de errores**: Validación de entrada y excepciones
- **Herencia**: Uso de herencia de clases para reutilización de código

## 📊 Ejemplos de Uso

### Ejemplo 1: Verificación de edad
```bash
$ python3 HowOldAreYou.py
Ingrese su edad: 25
Usted es mayor de edad
```

### Ejemplo 2: Validación de contraseña
```bash
$ python3 ValidateStorePass.py
Ingrese la contraseña: admin123
Contraseña válida
```

### Ejemplo 3: Menú principal
```bash
$ python3 Ejers.py
==================================================
=== MENÚ PRINCIPAL ===
1. HowOldAreYou - Verificar edad
2. ValidateStorePass - Validar contraseña
3. Divide - División de números
4. UnivenOrPair - Verificar par/impar
5. AgeTaxAction - Cálculo de impuestos por edad
6. SumNumber - Suma de números consecutivos
7. SumAllNum - Suma de todos los números
0. Salir
Seleccione una opción: 
```

## 🔧 Notas Técnicas

- Todos los programas usan `input()` para entrada del usuario
- Manejo de excepciones con `try/except` para entradas inválidas
- Uso de `datetime` para cálculos de fechas en AgeTaxAction
- Herencia de clases para reutilización de código
- Validación robusta de entrada de datos

## 👨‍💻 Autor

**Roger Coverzola Bogado**
- 📧 Email: [roger.bogado.coverzola@gmail.com]
- 💼 LinkedIn: [linkedin](https://www.linkedin.com/in/roger-c-77a27a192/?locale=en_US)
- 🐙 GitHub: [https://github.com/DIOLINK]

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo de licencia para más detalles.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. 🍴 Fork el proyecto
2. 🌿 Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push a la rama (`git push origin feature/AmazingFeature`)
5. 🔄 Abre un Pull Request

## 📊 Estadísticas del Proyecto

- 📁 **8 archivos Python**
- 📝 **~400 líneas de código**
- 🎯 **7 ejercicios funcionales**
- 🔧 **1 clase de utilidades**
- 🐍 **100% Python puro**

---

⭐ **¡Si te gusta este proyecto, no olvides darle una estrella!** ⭐