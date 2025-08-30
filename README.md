# Ejercicios TypeScript

Este proyecto contiene la transcripción de programas Java a TypeScript, incluyendo una variedad de ejercicios de programación.

## Programas Incluidos

1. **HowOldAreYou** - Verifica si una persona es mayor o menor de edad
2. **ValidateStorePass** - Valida contraseñas almacenadas
3. **Divide** - Realiza divisiones entre dos números
4. **UnivenOrPair** - Determina si un número es par o impar
5. **AgeTaxAction** - Calcula impuestos basados en edad e ingresos mensuales
6. **SumNumber** - Suma números consecutivos desde 1 hasta un valor dado
7. **SumAllNum** - Suma todos los números positivos ingresados

## Instalación

```bash
npm install
```

## Compilación

```bash
npm run build
```

## Ejecución

### Ejecutar el menú principal (recomendado)
```bash
npm start
```

### Ejecutar en modo desarrollo
```bash
npm run dev
```

### Ejecutar con compilación automática
```bash
npm run watch
```

## Estructura del Proyecto

```
src/
├── index.ts              # Menú principal
├── HowOldAreYou.ts       # Verificación de edad
├── ValidateStorePass.ts  # Validación de contraseñas
├── Divide.ts            # División de números
├── UnivenOrPair.ts      # Verificación par/impar
├── AgeTaxAction.ts      # Cálculo de impuestos
├── SumNumber.ts         # Suma de números consecutivos
├── SumAllNum.ts         # Suma de todos los números
└── ProgramUtil.ts       # Clase utilitaria base

dist/                    # Archivos compilados (generados automáticamente)
```

## Uso

1. Ejecuta `npm start` para iniciar el menú principal
2. Selecciona el número del programa que deseas ejecutar
3. Sigue las instrucciones en pantalla para cada programa
4. Selecciona 0 para salir

## Características

- **TypeScript**: Código tipado para mayor seguridad
- **Modular**: Cada programa es una clase independiente
- **Interactivo**: Interfaz de consola con menú principal
- **Reutilizable**: Clase base `ProgramUtil` para funcionalidad común

## Scripts Disponibles

- `npm run build` - Compila TypeScript a JavaScript
- `npm start` - Ejecuta el programa compilado
- `npm run dev` - Ejecuta directamente con ts-node
- `npm run watch` - Compila automáticamente al detectar cambios
- `npm run clean` - Elimina la carpeta dist

## Requisitos

- Node.js (versión 14 o superior)
- npm o yarn
