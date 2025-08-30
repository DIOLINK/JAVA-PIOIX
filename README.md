# 📚 Ejercicios TypeScript

Este proyecto contiene la transcripción de programas Java a TypeScript, incluyendo una variedad de ejercicios de programación.

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

- **TypeScript** - Lenguaje de programación principal
- **Node.js** - Entorno de ejecución
- **npm** - Gestión de dependencias

## 📦 Instalación y Configuración

### Prerrequisitos
- ☕ Node.js (versión 14 o superior)
- 📦 npm o yarn
- 💻 IDE compatible (VS Code, WebStorm, etc.)

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone [URL_DEL_REPOSITORIO]
   cd EjerTypescript
   ```

2. **Instalar dependencias**
   ```bash
   npm install
   ```

3. **Compilar el proyecto**
   ```bash
   npm run build
   ```

4. **Ejecutar el proyecto**
   ```bash
   npm start
   ```

## 🎮 Cómo usar

1. **Ejecuta el menú principal** con `npm start`
2. **Selecciona el número** del programa que deseas ejecutar
3. **Sigue las instrucciones** en pantalla para cada programa
4. **Selecciona 0** para salir

### Ejemplo de uso:
```bash
# Para ejecutar el proyecto completo
npm start

# Para ejecutar en modo desarrollo
npm run dev
```

## 📁 Estructura del Proyecto

```
📦 EjerTypescript/
├── 📄 package.json                    # Configuración de npm
├── 📄 tsconfig.json                   # Configuración de TypeScript
├── 📁 src/
│   ├── 🎯 index.ts                    # Clase principal
│   ├── 🎂 HowOldAreYou.ts            # Validación de edad
│   ├── 🔐 ValidateStorePass.ts       # Validación de contraseñas
│   ├── ➗ Divide.ts                  # Calculadora de división
│   ├── 🔢 UnivenOrPair.ts            # Números pares/impares
│   ├── 💰 AgeTaxAction.ts            # Cálculo de impuestos
│   ├── ➕ SumNumber.ts               # Suma de números
│   ├── 🔢 SumAllNum.ts               # Suma acumulativa
│   └── 🛠️ ProgramUtil.ts             # Utilidades comunes
└── 📁 dist/                           # Archivos compilados
```

## ✨ Características

- ✅ **7 ejercicios diferentes** de programación
- 🔧 **Utilidades comunes** para manejo de entrada de usuario
- 📦 **Proyecto TypeScript** con dependencias configuradas
- 🎯 **Código limpio** y bien documentado
- 🔄 **Manejo de errores** y validaciones
- 🔷 **TypeScript**: Código tipado para mayor seguridad
- 🧩 **Modular**: Cada programa es una clase independiente
- 💬 **Interactivo**: Interfaz de consola con menú principal
- ♻️ **Reutilizable**: Clase base `ProgramUtil` para funcionalidad común

## 📜 Scripts Disponibles

- `🔨 npm run build` - Compila TypeScript a JavaScript
- `▶️ npm start` - Ejecuta el programa compilado
- `▶️ npm run dev` - Ejecuta directamente con ts-node
- `▶️ npm run watch` - Compila automáticamente al detectar cambios
- `🧹 npm run clean` - Elimina la carpeta dist

## 📊 Estadísticas del Proyecto

- 📁 **8 archivos TypeScript**
- 📝 **~500 líneas de código**
- 🎯 **7 ejercicios funcionales**
- 🔧 **1 clase de utilidades**
