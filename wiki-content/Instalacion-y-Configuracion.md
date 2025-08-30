# 🛠️ Instalación y Configuración

Esta guía te ayudará a configurar el proyecto EjerTypeScript en tu máquina local.

## 📋 Prerrequisitos

Antes de comenzar, asegúrate de tener instalado:

| Herramienta | Versión Mínima | Descripción |
|-------------|----------------|-------------|
| ☕ **Node.js** | 14.x o superior | Entorno de ejecución de JavaScript |
| 📦 **npm** | 6.x o superior | Gestor de paquetes (incluido con Node.js) |
| 💻 **IDE** | - | Editor de código (VS Code recomendado) |
| 🐙 **Git** | 2.x o superior | Control de versiones |

### 🔍 Verificar Instalaciones

```bash
# Verificar Node.js
node --version
# Debería mostrar: v14.x.x o superior

# Verificar npm
npm --version
# Debería mostrar: 6.x.x o superior

# Verificar Git
git --version
# Debería mostrar: git version 2.x.x
```

## 📥 Instalación

### 1. **Clonar el Repositorio**

```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/EjerTypescript.git

# Navegar al directorio del proyecto
cd EjerTypescript
```

### 2. **Instalar Dependencias**

```bash
# Instalar todas las dependencias
npm install
```

Esto instalará las siguientes dependencias:

| Dependencia | Versión | Tipo | Descripción |
|-------------|---------|------|-------------|
| `@types/node` | ^20.10.0 | dev | Tipos de TypeScript para Node.js |
| `ts-node` | ^10.9.1 | dev | Ejecutor de TypeScript |
| `typescript` | ^5.3.0 | dev | Compilador de TypeScript |

### 3. **Verificar la Instalación**

```bash
# Verificar que las dependencias se instalaron correctamente
npm list
```

## 🔧 Configuración

### TypeScript Configuration

El proyecto incluye un archivo `tsconfig.json` optimizado:

```json
{
  "compilerOptions": {
    "target": "ES2020",
    "module": "commonjs",
    "lib": ["ES2020"],
    "outDir": "./dist",
    "rootDir": "./src",
    "strict": true,
    "esModuleInterop": true,
    "skipLibCheck": true,
    "forceConsistentCasingInFileNames": true,
    "resolveJsonModule": true,
    "declaration": true,
    "declarationMap": true,
    "sourceMap": true,
    "removeComments": false,
    "noImplicitAny": true,
    "noImplicitReturns": true,
    "noImplicitThis": true,
    "noUnusedLocals": true,
    "noUnusedParameters": true,
    "exactOptionalPropertyTypes": true,
    "noImplicitOverride": true,
    "noPropertyAccessFromIndexSignature": true,
    "noUncheckedIndexedAccess": true
  }
}
```

### 📁 Estructura de Directorios

Después de la instalación, tu proyecto debería verse así:

```
📦 EjerTypescript/
├── 📄 package.json                    # Configuración de npm
├── 📄 package-lock.json               # Lock file de dependencias
├── 📄 tsconfig.json                   # Configuración de TypeScript
├── 📄 README.md                       # Documentación principal
├── 📁 src/                            # Código fuente TypeScript
│   ├── 🎯 index.ts                    # Punto de entrada principal
│   ├── 🎂 HowOldAreYou.ts            # Ejercicio de validación de edad
│   ├── 🔐 ValidateStorePass.ts       # Ejercicio de validación de contraseñas
│   ├── ➗ Divide.ts                  # Ejercicio de división
│   ├── 🔢 UnivenOrPair.ts            # Ejercicio de números pares/impares
│   ├── 💰 AgeTaxAction.ts            # Ejercicio de cálculo de impuestos
│   ├── ➕ SumNumber.ts               # Ejercicio de suma de números
│   ├── 🔢 SumAllNum.ts               # Ejercicio de suma acumulativa
│   └── 🛠️ ProgramUtil.ts             # Clase de utilidades comunes
├── 📁 dist/                           # Archivos compilados (generado)
├── 📁 node_modules/                   # Dependencias (generado)
└── 📁 wiki-content/                   # Contenido de la wiki
```

## 🚀 Scripts Disponibles

El proyecto incluye varios scripts npm para facilitar el desarrollo:

| Script | Comando | Descripción |
|--------|---------|-------------|
| 🔨 **build** | `npm run build` | Compila TypeScript a JavaScript |
| ▶️ **start** | `npm start` | Ejecuta el programa compilado |
| ▶️ **dev** | `npm run dev` | Ejecuta directamente con ts-node |
| ▶️ **watch** | `npm run watch` | Compila automáticamente al detectar cambios |
| 🧹 **clean** | `npm run clean` | Elimina la carpeta dist |

### Ejemplos de Uso

```bash
# Compilar el proyecto
npm run build

# Ejecutar el programa
npm start

# Ejecutar en modo desarrollo (sin compilar)
npm run dev

# Compilar automáticamente al hacer cambios
npm run watch

# Limpiar archivos compilados
npm run clean
```

## 🧪 Verificar la Instalación

### 1. **Compilar el Proyecto**

```bash
npm run build
```

Esto debería crear la carpeta `dist/` con los archivos JavaScript compilados.

### 2. **Ejecutar el Programa**

```bash
npm start
```

Deberías ver el menú principal:

```
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

## 🔧 Configuración del IDE

### Visual Studio Code (Recomendado)

1. **Instalar Extensiones:**
   - TypeScript Importer
   - ES7+ React/Redux/React-Native snippets
   - Prettier - Code formatter

2. **Configuración del Workspace:**
   ```json
   {
     "typescript.preferences.importModuleSpecifier": "relative",
     "editor.formatOnSave": true,
     "editor.codeActionsOnSave": {
       "source.organizeImports": true
     }
   }
   ```

### WebStorm

1. **Configuración de TypeScript:**
   - File → Settings → Languages & Frameworks → TypeScript
   - Habilitar "Use TypeScript service"

## 🐛 Solución de Problemas

### Error: "ts-node no encontrado"

```bash
# Reinstalar dependencias
rm -rf node_modules package-lock.json
npm install
```

### Error: "Cannot find module"

```bash
# Verificar que estás en el directorio correcto
pwd
# Debería mostrar: /ruta/a/EjerTypescript

# Reinstalar dependencias
npm install
```

### Error de Compilación TypeScript

```bash
# Limpiar y recompilar
npm run clean
npm run build
```

### Problemas de Permisos (Linux/Mac)

```bash
# Dar permisos de ejecución
chmod +x node_modules/.bin/*
```

## 📚 Recursos Adicionales

- [Documentación oficial de TypeScript](https://www.typescriptlang.org/docs/)
- [Guía de Node.js](https://nodejs.org/en/docs/)
- [Documentación de npm](https://docs.npmjs.com/)

---

<div align="center">

**[⬅️ Lista de Ejercicios](Lista-de-Ejercicios)** | **[💻 Guía de Uso ➡️](Guia-de-Uso)**

</div>
