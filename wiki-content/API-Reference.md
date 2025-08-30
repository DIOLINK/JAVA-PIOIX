# 🔧 API Reference

Documentación completa de las clases, métodos y propiedades del proyecto EjerTypeScript.

## 📋 Índice

- [🎯 Ejers (Clase Principal)](#-ejers-clase-principal)
- [🎂 HowOldAreYou](#-howoldareyou)
- [🔐 ValidateStorePass](#-validatestorepass)
- [➗ Divide](#-divide)
- [🔢 UnivenOrPair](#-univenorpair)
- [💰 AgeTaxAction](#-agetaxaction)
- [➕ SumNumber](#-sumnumber)
- [🔢 SumAllNum](#-sumallnum)
- [🛠️ ProgramUtil](#️-programutil)

---

## 🎯 Ejers (Clase Principal)

Clase principal que maneja el menú y la navegación entre ejercicios.

### 📝 Descripción
```typescript
class Ejers
```

### 🔧 Propiedades Estáticas

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `MESSAGES` | `string[]` | Array de mensajes del menú principal |

### 🎯 Métodos Públicos

#### `main(): void`
Método principal que inicia la aplicación.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Configura la interfaz de consola y muestra el menú principal.

**Ejemplo:**
```typescript
Ejers.main();
```

### 🔒 Métodos Privados

#### `showMenu(): void`
Muestra el menú principal y maneja la entrada del usuario.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Presenta las opciones disponibles y procesa la selección del usuario.

---

## 🎂 HowOldAreYou

Clase para validación de edad y determinación de mayoría de edad.

### 📝 Descripción
```typescript
class HowOldAreYou
```

### 🔧 Propiedades Estáticas

| Propiedad | Tipo | Valor | Descripción |
|-----------|------|-------|-------------|
| `OLD_AGE` | `number` | `18` | Edad mínima para mayoría de edad |
| `ZERO` | `number` | `0` | Valor mínimo de edad |
| `MAX_AGE` | `number` | `150` | Valor máximo de edad |
| `MESSAGES` | `string[]` | Array | Mensajes del sistema |

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |
| `EXIT` | `boolean` | Control de flujo del programa |

### 🎯 Métodos Públicos

#### `validateAge(age: number): number`
Valida que la edad esté en el rango permitido.

**Parámetros:**
- `age: number` - Edad a validar

**Retorna:** `number` - La edad validada

**Descripción:** Verifica que la edad esté entre 0 y 150 años.

**Ejemplo:**
```typescript
const howOld = new HowOldAreYou();
const validAge = howOld.validateAge(25); // Retorna 25
```

#### `ask(): void`
Inicia el proceso de solicitud de edad.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita la edad al usuario y determina si es mayor o menor de edad.

**Ejemplo:**
```typescript
const howOld = new HowOldAreYou();
howOld.ask(); // Inicia la interacción
```

### 🔒 Métodos Privados

#### `isOld(age: number): void`
Determina si la edad corresponde a mayor o menor de edad.

**Parámetros:**
- `age: number` - Edad a evaluar

**Retorna:** `void`

**Descripción:** Compara la edad con el límite de mayoría de edad (18 años).

---

## 🔐 ValidateStorePass

Clase para validación de contraseñas con múltiples intentos.

### 📝 Descripción
```typescript
class ValidateStorePass
```

### 🔧 Propiedades Estáticas

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `MESSAJE` | `string[]` | Array de mensajes del sistema |

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `store_pass` | `string[]` | Array de contraseñas válidas |
| `scanner` | `any` | Interfaz de lectura de consola |
| `is_exit` | `boolean` | Control de flujo del programa |

### 🎯 Constructor

#### `constructor(...arr_pass: string[])`
Inicializa la clase con las contraseñas válidas.

**Parámetros:**
- `...arr_pass: string[]` - Contraseñas válidas (spread operator)

**Ejemplo:**
```typescript
const passwords = ["password1", "password2", "password3"];
const validator = new ValidateStorePass(...passwords);
```

### 🎯 Métodos Públicos

#### `isValidate(): void`
Inicia el proceso de validación de contraseñas.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita contraseñas al usuario hasta que ingrese una válida.

**Ejemplo:**
```typescript
const validator = new ValidateStorePass("password123");
validator.isValidate(); // Inicia la validación
```

### 🔒 Métodos Privados

#### `validatePass(pass: string): boolean`
Valida si la contraseña ingresada es correcta.

**Parámetros:**
- `pass: string` - Contraseña a validar

**Retorna:** `boolean` - `true` si es válida, `false` si no

**Descripción:** Compara la contraseña (case-insensitive) con las almacenadas.

**Ejemplo:**
```typescript
const isValid = validator.validatePass("PASSWORD123"); // true si está en la lista
```

---

## ➗ Divide

Clase para realizar operaciones de división.

### 📝 Descripción
```typescript
class Divide
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |

### 🎯 Métodos Públicos

#### `divideAtoB(): void`
Realiza la división entre dos números.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita dos números al usuario y realiza la división.

**Ejemplo:**
```typescript
const divide = new Divide();
divide.divideAtoB(); // Inicia el proceso de división
```

### 🔒 Métodos Privados

#### `getNumber(prompt: string): Promise<number>`
Solicita un número al usuario.

**Parámetros:**
- `prompt: string` - Mensaje a mostrar al usuario

**Retorna:** `Promise<number>` - Número ingresado por el usuario

#### `performDivision(a: number, b: number): void`
Realiza la operación de división.

**Parámetros:**
- `a: number` - Dividendo
- `b: number` - Divisor

**Retorna:** `void`

**Descripción:** Calcula y muestra el resultado de la división.

---

## 🔢 UnivenOrPair

Clase para determinar si un número es par o impar.

### 📝 Descripción
```typescript
class UnivenOrPair
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |

### 🎯 Métodos Públicos

#### `isPair(): void`
Determina si un número es par o impar.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita un número al usuario y determina su paridad.

**Ejemplo:**
```typescript
const checker = new UnivenOrPair();
checker.isPair(); // Inicia la verificación
```

### 🔒 Métodos Privados

#### `getNumber(): Promise<number>`
Solicita un número al usuario.

**Retorna:** `Promise<number>` - Número ingresado

#### `checkParity(number: number): void`
Verifica si el número es par o impar.

**Parámetros:**
- `number: number` - Número a verificar

**Retorna:** `void`

**Descripción:** Usa el operador módulo para determinar la paridad.

---

## 💰 AgeTaxAction

Clase para calcular impuestos basados en la edad.

### 📝 Descripción
```typescript
class AgeTaxAction
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |

### 🎯 Métodos Públicos

#### `calTaxAction(): void`
Calcula impuestos basados en edad e ingresos.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita edad e ingresos, luego calcula el impuesto correspondiente.

**Ejemplo:**
```typescript
const taxCalculator = new AgeTaxAction();
taxCalculator.calTaxAction(); // Inicia el cálculo
```

### 🔒 Métodos Privados

#### `getAge(): Promise<number>`
Solicita la edad al usuario.

**Retorna:** `Promise<number>` - Edad ingresada

#### `getIncome(): Promise<number>`
Solicita los ingresos al usuario.

**Retorna:** `Promise<number>` - Ingresos ingresados

#### `calculateTax(age: number, income: number): number`
Calcula el impuesto total.

**Parámetros:**
- `age: number` - Edad del usuario
- `income: number` - Ingresos del usuario

**Retorna:** `number` - Impuesto calculado

#### `getTaxRate(age: number): number`
Determina la tasa de impuesto según la edad.

**Parámetros:**
- `age: number` - Edad del usuario

**Retorna:** `number` - Tasa de impuesto (0.05, 0.10, 0.15)

**Lógica de tasas:**
- 0-17 años: 5%
- 18-65 años: 15%
- 66+ años: 10%

---

## ➕ SumNumber

Clase para realizar sumas de números.

### 📝 Descripción
```typescript
class SumNumber
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |

### 🎯 Métodos Públicos

#### `cal(): void`
Realiza la suma de dos números.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita dos números y calcula su suma.

**Ejemplo:**
```typescript
const adder = new SumNumber();
adder.cal(); // Inicia la suma
```

### 🔒 Métodos Privados

#### `getNumbers(): Promise<[number, number]>`
Solicita dos números al usuario.

**Retorna:** `Promise<[number, number]>` - Tupla con los dos números

#### `performSum(a: number, b: number): void`
Realiza la operación de suma.

**Parámetros:**
- `a: number` - Primer número
- `b: number` - Segundo número

**Retorna:** `void`

**Descripción:** Calcula y muestra el resultado de la suma.

---

## 🔢 SumAllNum

Clase para suma acumulativa de múltiples números.

### 📝 Descripción
```typescript
class SumAllNum
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Descripción |
|-----------|------|-------------|
| `scanner` | `any` | Interfaz de lectura de consola |

### 🎯 Métodos Públicos

#### `cal(): void`
Realiza la suma acumulativa de números.

**Parámetros:** Ninguno

**Retorna:** `void`

**Descripción:** Solicita números hasta que se ingrese uno negativo, luego suma todos.

**Ejemplo:**
```typescript
const accumulator = new SumAllNum();
accumulator.cal(); // Inicia la suma acumulativa
```

### 🔒 Métodos Privados

#### `getNumbers(): Promise<number[]>`
Solicita números al usuario hasta ingresar uno negativo.

**Retorna:** `Promise<number[]>` - Array de números ingresados

#### `calculateSum(numbers: number[]): number`
Calcula la suma de un array de números.

**Parámetros:**
- `numbers: number[]` - Array de números a sumar

**Retorna:** `number` - Suma total

**Descripción:** Usa el método `reduce` para sumar todos los números.

---

## 🛠️ ProgramUtil

Clase base con utilidades comunes para todos los ejercicios.

### 📝 Descripción
```typescript
export class ProgramUtil
```

### 🔧 Propiedades de Instancia

| Propiedad | Tipo | Valor por Defecto | Descripción |
|-----------|------|-------------------|-------------|
| `EXIT` | `boolean` | `true` | Control de flujo del programa |
| `scanner` | `any` | `undefined` | Interfaz de lectura de consola |
| `MESSAGES` | `string[]` | `[]` | Array de mensajes del programa |

### 🎯 Métodos Públicos

#### `init(...messajes: string[]): void`
Inicializa la clase con mensajes y configura la interfaz de consola.

**Parámetros:**
- `...messajes: string[]` - Mensajes del programa (spread operator)

**Retorna:** `void`

**Descripción:** Configura readline y almacena los mensajes proporcionados.

**Ejemplo:**
```typescript
const util = new ProgramUtil();
util.init("Mensaje 1", "Mensaje 2", "Mensaje 3");
```

**Funcionalidades:**
- ✅ Configura la interfaz `readline`
- ✅ Almacena los mensajes en el array `MESSAGES`
- ✅ Prepara la clase para su uso

---

## 🔄 Patrones de Uso

### Creación de Instancias

```typescript
// Ejercicio con parámetros
const validator = new ValidateStorePass("pass1", "pass2", "pass3");

// Ejercicio sin parámetros
const howOld = new HowOldAreYou();
const divide = new Divide();
```

### Ejecución de Métodos

```typescript
// Método principal
howOld.ask();
validator.isValidate();
divide.divideAtoB();

// Método con validación
const age = howOld.validateAge(25);
```

### Manejo de Errores

```typescript
try {
    const howOld = new HowOldAreYou();
    howOld.ask();
} catch (error) {
    console.error("Error:", error);
}
```

---

## 📊 Resumen de Métodos

| Clase | Métodos Públicos | Métodos Privados | Total |
|-------|------------------|------------------|-------|
| `Ejers` | 1 | 1 | 2 |
| `HowOldAreYou` | 2 | 1 | 3 |
| `ValidateStorePass` | 1 | 1 | 2 |
| `Divide` | 1 | 2 | 3 |
| `UnivenOrPair` | 1 | 2 | 3 |
| `AgeTaxAction` | 1 | 4 | 5 |
| `SumNumber` | 1 | 2 | 3 |
| `SumAllNum` | 1 | 2 | 3 |
| `ProgramUtil` | 1 | 0 | 1 |
| **Total** | **10** | **15** | **25** |

---

<div align="center">

**[⬅️ Estructura del Proyecto](Estructura-del-Proyecto)** | **[❓ FAQ ➡️](FAQ)**

</div>
