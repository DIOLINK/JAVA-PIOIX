# 💻 Guía de Uso

Esta guía te enseñará cómo usar cada ejercicio del proyecto EjerTypeScript paso a paso.

## 🚀 Inicio Rápido

### 1. **Ejecutar el Programa**

```bash
# Compilar y ejecutar
npm run build
npm start

# O ejecutar directamente en modo desarrollo
npm run dev
```

### 2. **Navegar por el Menú**

El programa mostrará un menú interactivo:

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

### 3. **Seleccionar un Ejercicio**

Simplemente escribe el número del ejercicio que deseas ejecutar y presiona **Enter**.

---

## 🎂 Ejercicio 1: HowOldAreYou

### 📝 Descripción
Valida la edad del usuario y determina si es mayor o menor de edad.

### 🎮 Cómo Usar

1. **Selecciona la opción 1** en el menú principal
2. **Ingresa tu edad** cuando se te solicite
3. **Recibe el resultado** (Mayor o Menor de edad)

### 💡 Ejemplo de Interacción

```
=== HowOldAreYou ===
Ingresar solo el numeros que correspondan a tu edad
Cuantos años tienes?: 25
Eres Mayor de edad!
```

### ⚠️ Validaciones

- ✅ **Edad válida**: Entre 0 y 150 años
- ❌ **Edad inválida**: Fuera del rango permitido
- 🔄 **Reintentos**: El programa continúa pidiendo edad hasta que ingreses 0 para salir

### 🎯 Casos de Uso

| Edad | Resultado | Descripción |
|------|-----------|-------------|
| 18 | Mayor de edad | Límite mínimo para mayoría de edad |
| 25 | Mayor de edad | Adulto joven |
| 17 | Menor de edad | Adolescente |
| 0 | Error | Edad inválida |
| 151 | Error | Edad inválida |

---

## 🔐 Ejercicio 2: ValidateStorePass

### 📝 Descripción
Sistema de validación de contraseñas con múltiples intentos.

### 🎮 Cómo Usar

1. **Selecciona la opción 2** en el menú principal
2. **Ingresa una contraseña** cuando se te solicite
3. **Recibe feedback** sobre si es correcta o incorrecta
4. **Continúa intentando** hasta que ingreses la contraseña correcta

### 💡 Ejemplo de Interacción

```
=== ValidateStorePass ===
Ingrese la clave: password123
Incorrecta!!
Intente nuevamente
Ingrese la clave: VVIRKvysEZj5S4
Correcta!!
```

### 🔑 Contraseñas Válidas

El sistema incluye estas contraseñas predefinidas:

- `VVIRKvysEZj5S4`
- `VpP1Y9JXQ5psrl`
- `casI13245`

### ✨ Características

- 🔄 **Reintentos ilimitados**: Puedes intentar tantas veces como quieras
- 🔤 **Case-insensitive**: No importa si usas mayúsculas o minúsculas
- ✅ **Terminación automática**: El programa termina cuando ingresas la contraseña correcta

---

## ➗ Ejercicio 3: Divide

### 📝 Descripción
Calculadora de división entre dos números.

### 🎮 Cómo Usar

1. **Selecciona la opción 3** en el menú principal
2. **Ingresa el primer número** (dividendo)
3. **Ingresa el segundo número** (divisor)
4. **Recibe el resultado** de la división

### 💡 Ejemplo de Interacción

```
=== Divide ===
Ingrese el primer número: 10
Ingrese el segundo número: 2
El resultado de la división es: 5
```

### ⚠️ Casos Especiales

| Dividendo | Divisor | Resultado | Descripción |
|-----------|---------|-----------|-------------|
| 10 | 2 | 5 | División normal |
| 7 | 3 | 2.33... | División con decimales |
| 0 | 5 | 0 | Cero dividido por cualquier número |
| 5 | 0 | Error | División por cero |

---

## 🔢 Ejercicio 4: UnivenOrPair

### 📝 Descripción
Determina si un número es par o impar.

### 🎮 Cómo Usar

1. **Selecciona la opción 4** en el menú principal
2. **Ingresa un número** cuando se te solicite
3. **Recibe el resultado** (PAR o IMPAR)

### 💡 Ejemplo de Interacción

```
=== UnivenOrPair ===
Ingrese un número: 7
El número 7 es IMPAR
```

### 🧮 Lógica del Algoritmo

El programa usa el operador módulo (`%`) para determinar si un número es par o impar:

- **Número PAR**: `número % 2 === 0`
- **Número IMPAR**: `número % 2 !== 0`

### 🎯 Ejemplos

| Número | Resultado | Explicación |
|--------|-----------|-------------|
| 2 | PAR | 2 ÷ 2 = 1, residuo 0 |
| 7 | IMPAR | 7 ÷ 2 = 3, residuo 1 |
| 0 | PAR | 0 ÷ 2 = 0, residuo 0 |
| -4 | PAR | -4 ÷ 2 = -2, residuo 0 |

---

## 💰 Ejercicio 5: AgeTaxAction

### 📝 Descripción
Calcula impuestos basados en la edad del usuario.

### 🎮 Cómo Usar

1. **Selecciona la opción 5** en el menú principal
2. **Ingresa tu edad** cuando se te solicite
3. **Ingresa tu ingreso** cuando se te solicite
4. **Recibe el cálculo** de impuestos

### 💡 Ejemplo de Interacción

```
=== AgeTaxAction ===
Ingrese su edad: 25
Ingrese su ingreso: 50000
Su impuesto calculado es: $7500
```

### 📊 Tasas de Impuestos

El sistema aplica diferentes tasas según la edad:

| Rango de Edad | Tasa de Impuesto | Descripción |
|---------------|------------------|-------------|
| 0-17 | 5% | Menores de edad |
| 18-65 | 15% | Adultos en edad laboral |
| 66+ | 10% | Adultos mayores |

### 🧮 Fórmula de Cálculo

```
Impuesto = Ingreso × Tasa_por_Edad
```

---

## ➕ Ejercicio 6: SumNumber

### 📝 Descripción
Suma dos números ingresados por el usuario.

### 🎮 Cómo Usar

1. **Selecciona la opción 6** en el menú principal
2. **Ingresa el primer número** cuando se te solicite
3. **Ingresa el segundo número** cuando se te solicite
4. **Recibe la suma** de ambos números

### 💡 Ejemplo de Interacción

```
=== SumNumber ===
Ingrese el primer número: 5
Ingrese el segundo número: 3
La suma es: 8
```

### 🧮 Operaciones Soportadas

- ✅ **Números enteros**: 5 + 3 = 8
- ✅ **Números decimales**: 2.5 + 1.5 = 4.0
- ✅ **Números negativos**: -5 + 3 = -2
- ✅ **Cero**: 0 + 5 = 5

---

## 🔢 Ejercicio 7: SumAllNum

### 📝 Descripción
Suma acumulativa de múltiples números hasta ingresar un número negativo.

### 🎮 Cómo Usar

1. **Selecciona la opción 7** en el menú principal
2. **Ingresa números positivos** uno por uno
3. **Ve la suma acumulativa** después de cada número
4. **Ingresa un número negativo** para terminar
5. **Recibe la suma final**

### 💡 Ejemplo de Interacción

```
=== SumAllNum ===
Ingrese un número (negativo para terminar): 5
Suma actual: 5
Ingrese un número (negativo para terminar): 3
Suma actual: 8
Ingrese un número (negativo para terminar): 2
Suma actual: 10
Ingrese un número (negativo para terminar): -1
Suma final: 10
```

### 🔄 Flujo del Programa

1. **Inicialización**: Suma = 0
2. **Entrada de números**: Solicita números positivos
3. **Acumulación**: Suma cada número a la suma total
4. **Feedback**: Muestra la suma actual
5. **Terminación**: Al ingresar un número negativo
6. **Resultado final**: Muestra la suma total

---

## 🎯 Consejos de Uso

### ✅ Mejores Prácticas

1. **Lee las instrucciones** cuidadosamente antes de ingresar datos
2. **Usa números válidos** para evitar errores
3. **Presiona Enter** después de cada entrada
4. **Usa 0 para salir** de los ejercicios que lo permitan

### ⚠️ Errores Comunes

1. **Entrada no numérica**: Algunos ejercicios requieren números
2. **Valores fuera de rango**: Respeta los límites establecidos
3. **No presionar Enter**: Asegúrate de confirmar cada entrada

### 🔄 Navegación

- **Volver al menú**: Algunos ejercicios regresan automáticamente
- **Salir del programa**: Usa la opción 0 en el menú principal
- **Reiniciar ejercicio**: Ejecuta nuevamente la opción deseada

---

## 🆘 Solución de Problemas

### El programa no responde
```bash
# Presiona Ctrl+C para interrumpir
# Luego ejecuta nuevamente
npm start
```

### Error de entrada
- Asegúrate de ingresar solo números cuando se solicite
- No uses comas o puntos como separadores de miles

### El menú no aparece
```bash
# Verifica que el proyecto esté compilado
npm run build
npm start
```

---

<div align="center">

**[⬅️ Instalación y Configuración](Instalacion-y-Configuracion)** | **[📁 Estructura del Proyecto ➡️](Estructura-del-Proyecto)**

</div>
