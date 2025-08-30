# 📋 Lista de Ejercicios

Esta página contiene una descripción detallada de cada ejercicio disponible en el proyecto EjerTypeScript.

## 🎂 1. HowOldAreYou

**Validación de edad y determinación de mayoría de edad**

### 📝 Descripción
Este ejercicio solicita la edad del usuario, valida que esté en un rango válido (0-150 años) y determina si es mayor o menor de edad (18 años).

### 🔧 Funcionalidades
- ✅ Validación de entrada numérica
- ✅ Rango de edad válido (0-150 años)
- ✅ Determinación de mayoría de edad (18 años)
- ✅ Manejo de errores y reintentos
- ✅ Interfaz interactiva de consola

### 💻 Ejemplo de Uso
```
Cuantos años tienes?: 25
Eres Mayor de edad!
```

### 🏗️ Estructura de la Clase
```typescript
class HowOldAreYou {
    private static readonly OLD_AGE: number = 18;
    private static readonly ZERO: number = 0;
    private static readonly MAX_AGE: number = 150;
    
    public validateAge(age: number): number
    private isOld(age: number): void
    public ask(): void
}
```

---

## 🔐 2. ValidateStorePass

**Sistema de validación de contraseñas**

### 📝 Descripción
Almacena un conjunto de contraseñas válidas y permite al usuario intentar ingresar una contraseña hasta que sea correcta.

### 🔧 Funcionalidades
- ✅ Almacenamiento de múltiples contraseñas válidas
- ✅ Validación case-insensitive
- ✅ Sistema de reintentos ilimitados
- ✅ Mensajes de feedback al usuario
- ✅ Terminación automática al éxito

### 💻 Ejemplo de Uso
```
Ingrese la clave: password123
Incorrecta!!
Intente nuevamente
Ingrese la clave: VVIRKvysEZj5S4
Correcta!!
```

### 🏗️ Estructura de la Clase
```typescript
class ValidateStorePass {
    private store_pass: string[];
    private scanner: any;
    private is_exit: boolean = true;
    
    constructor(...arr_pass: string[])
    private validatePass(pass: string): boolean
    public isValidate(): void
}
```

---

## ➗ 3. Divide

**Calculadora de división**

### 📝 Descripción
Realiza operaciones de división entre dos números con manejo de casos especiales.

### 🔧 Funcionalidades
- ✅ División de dos números
- ✅ Manejo de división por cero
- ✅ Validación de entrada numérica
- ✅ Resultados con decimales

### 💻 Ejemplo de Uso
```
Ingrese el primer número: 10
Ingrese el segundo número: 2
El resultado de la división es: 5
```

---

## 🔢 4. UnivenOrPair

**Determinación de números pares e impares**

### 📝 Descripción
Recibe un número del usuario y determina si es par o impar.

### 🔧 Funcionalidades
- ✅ Validación de entrada numérica
- ✅ Algoritmo de determinación par/impar
- ✅ Mensajes claros de resultado
- ✅ Manejo de números negativos

### 💻 Ejemplo de Uso
```
Ingrese un número: 7
El número 7 es IMPAR
```

---

## 💰 5. AgeTaxAction

**Cálculo de impuestos basado en edad**

### 📝 Descripción
Calcula impuestos considerando la edad del usuario y aplica diferentes tasas según criterios de edad.

### 🔧 Funcionalidades
- ✅ Cálculo de impuestos por edad
- ✅ Diferentes tasas según rangos de edad
- ✅ Validación de entrada
- ✅ Resultados detallados

### 💻 Ejemplo de Uso
```
Ingrese su edad: 25
Ingrese su ingreso: 50000
Su impuesto calculado es: $7500
```

---

## ➕ 6. SumNumber

**Suma de números**

### 📝 Descripción
Realiza operaciones de suma con números ingresados por el usuario.

### 🔧 Funcionalidades
- ✅ Suma de múltiples números
- ✅ Validación de entrada numérica
- ✅ Resultado acumulativo
- ✅ Interfaz intuitiva

### 💻 Ejemplo de Uso
```
Ingrese el primer número: 5
Ingrese el segundo número: 3
La suma es: 8
```

---

## 🔢 7. SumAllNum

**Suma acumulativa de números**

### 📝 Descripción
Permite ingresar múltiples números positivos, suma todos los números ingresados y termina cuando se ingresa un número negativo.

### 🔧 Funcionalidades
- ✅ Entrada de múltiples números
- ✅ Suma acumulativa en tiempo real
- ✅ Terminación con número negativo
- ✅ Validación de entrada
- ✅ Resultado final

### 💻 Ejemplo de Uso
```
Ingrese un número (negativo para terminar): 5
Suma actual: 5
Ingrese un número (negativo para terminar): 3
Suma actual: 8
Ingrese un número (negativo para terminar): -1
Suma final: 8
```

---

## 🛠️ Clase de Utilidades

### ProgramUtil

**Clase base para funcionalidad común**

### 📝 Descripción
Proporciona utilidades comunes para el manejo de entrada de usuario y configuración de interfaz de consola.

### 🔧 Funcionalidades
- ✅ Configuración de readline
- ✅ Manejo de mensajes
- ✅ Control de flujo de programa
- ✅ Reutilización de código

### 🏗️ Estructura de la Clase
```typescript
class ProgramUtil {
    public EXIT: boolean = true;
    public scanner: any;
    public MESSAGES: string[];
    
    public init(...messajes: string[]): void
}
```

---

## 🎯 Cómo Ejecutar los Ejercicios

1. **Ejecuta el menú principal** con `npm start`
2. **Selecciona el número** del programa que deseas ejecutar (1-7)
3. **Sigue las instrucciones** en pantalla para cada programa
4. **Selecciona 0** para salir

### Ejemplo de Menú
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

---

<div align="center">

**[⬅️ Volver al Home](Home)** | **[🛠️ Instalación y Configuración ➡️](Instalacion-y-Configuracion)**

</div>
