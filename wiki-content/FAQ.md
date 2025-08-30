# ❓ FAQ (Preguntas Frecuentes)

Esta sección responde las preguntas más comunes sobre el proyecto EjerTypeScript.

## 🚀 Instalación y Configuración

### ❓ ¿Qué versión de Node.js necesito?

**Respuesta:** Necesitas Node.js versión 14.x o superior.

```bash
# Verificar tu versión
node --version
```

Si tienes una versión anterior, puedes:
- **Actualizar Node.js** desde [nodejs.org](https://nodejs.org/)
- **Usar nvm** para gestionar múltiples versiones:
  ```bash
  nvm install 18
  nvm use 18
  ```

### ❓ ¿Por qué no puedo ejecutar `npm start`?

**Respuesta:** Probablemente no has compilado el proyecto. Sigue estos pasos:

```bash
# 1. Instalar dependencias
npm install

# 2. Compilar TypeScript
npm run build

# 3. Ejecutar el programa
npm start
```

### ❓ ¿Qué significa el error "ts-node no encontrado"?

**Respuesta:** Las dependencias no se instalaron correctamente. Solución:

```bash
# Eliminar node_modules y package-lock.json
rm -rf node_modules package-lock.json

# Reinstalar dependencias
npm install
```

### ❓ ¿Puedo usar yarn en lugar de npm?

**Respuesta:** Sí, puedes usar yarn:

```bash
# Instalar dependencias
yarn install

# Compilar
yarn build

# Ejecutar
yarn start
```

---

## 🎮 Uso del Programa

### ❓ ¿Cómo salgo del programa?

**Respuesta:** En el menú principal, selecciona la opción **0** para salir.

```
=== MENÚ PRINCIPAL ===
...
0. Salir
Seleccione una opción: 0
```

### ❓ ¿Cómo vuelvo al menú principal desde un ejercicio?

**Respuesta:** Depende del ejercicio:

- **HowOldAreYou**: Ingresa `0` como edad
- **ValidateStorePass**: Ingresa la contraseña correcta
- **Otros ejercicios**: Terminan automáticamente y regresan al menú

### ❓ ¿Qué pasa si ingreso datos incorrectos?

**Respuesta:** El programa maneja errores de diferentes maneras:

- **Números inválidos**: Te pedirá que ingreses un número válido
- **Edades fuera de rango**: Te mostrará un mensaje de error
- **Contraseñas incorrectas**: Te permitirá intentar nuevamente

### ❓ ¿Puedo ejecutar ejercicios individuales?

**Respuesta:** Sí, puedes modificar el código para ejecutar ejercicios específicos:

```typescript
// En index.ts, comenta el menú y ejecuta directamente:
const howOld = new HowOldAreYou();
howOld.ask();
```

---

## 🔧 Desarrollo y Personalización

### ❓ ¿Cómo agrego un nuevo ejercicio?

**Respuesta:** Sigue estos pasos:

1. **Crear la clase del ejercicio:**
   ```typescript
   // src/MiNuevoEjercicio.ts
   export class MiNuevoEjercicio {
       private scanner: any;
       
       constructor() {
           this.scanner = require('readline').createInterface({
               input: process.stdin,
               output: process.stdout
           });
       }
       
       public ejecutar(): void {
           // Tu lógica aquí
       }
   }
   ```

2. **Importar en index.ts:**
   ```typescript
   import { MiNuevoEjercicio } from './MiNuevoEjercicio';
   ```

3. **Agregar al menú:**
   ```typescript
   // En el array MESSAGES
   "8. MiNuevoEjercicio - Descripción del ejercicio",
   
   // En el switch
   case 8:
       const miEjercicio = new MiNuevoEjercicio();
       miEjercicio.ejecutar();
       break;
   ```

### ❓ ¿Cómo modifico las contraseñas válidas?

**Respuesta:** En el archivo `index.ts`, línea 48:

```typescript
// Cambiar estas contraseñas
const passwords = ["nueva_password1", "nueva_password2", "nueva_password3"];
const validatePass = new ValidateStorePass(...passwords);
```

### ❓ ¿Cómo cambio los rangos de edad en HowOldAreYou?

**Respuesta:** En el archivo `HowOldAreYou.ts`:

```typescript
class HowOldAreYou {
    private static readonly OLD_AGE: number = 21; // Cambiar de 18 a 21
    private static readonly MAX_AGE: number = 120; // Cambiar de 150 a 120
}
```

### ❓ ¿Cómo modifico las tasas de impuesto?

**Respuesta:** En el archivo `AgeTaxAction.ts`, método `getTaxRate`:

```typescript
private getTaxRate(age: number): number {
    if (age <= 17) return 0.03; // Cambiar de 0.05 a 0.03
    if (age <= 65) return 0.20; // Cambiar de 0.15 a 0.20
    return 0.08; // Cambiar de 0.10 a 0.08
}
```

---

## 🐛 Solución de Problemas

### ❓ El programa se cuelga y no responde

**Respuesta:** Presiona `Ctrl+C` para interrumpir y luego:

```bash
# Reiniciar el programa
npm start
```

### ❓ Los caracteres especiales no se muestran correctamente

**Respuesta:** Asegúrate de que tu terminal soporte UTF-8:

```bash
# En Windows (PowerShell)
chcp 65001

# En Linux/Mac
export LANG=en_US.UTF-8
```

### ❓ El menú no se muestra correctamente

**Respuesta:** Verifica que el proyecto esté compilado:

```bash
npm run build
npm start
```

### ❓ Error "Cannot find module" al ejecutar

**Respuesta:** Verifica que estés en el directorio correcto:

```bash
# Verificar ubicación
pwd
# Debería mostrar: /ruta/a/EjerTypescript

# Reinstalar dependencias
npm install
```

---

## 📚 Conceptos Técnicos

### ❓ ¿Qué es TypeScript?

**Respuesta:** TypeScript es un superset de JavaScript que añade tipado estático. En este proyecto:

- ✅ **Tipos explícitos**: `number`, `string`, `boolean`
- ✅ **Interfaces**: Para definir estructuras de datos
- ✅ **Clases**: Para programación orientada a objetos
- ✅ **Compilación**: Se convierte a JavaScript para ejecutarse

### ❓ ¿Por qué usar clases en lugar de funciones?

**Respuesta:** Las clases ofrecen:

- 🏗️ **Organización**: Código más estructurado
- 🔄 **Reutilización**: Herencia y composición
- 🎯 **Encapsulación**: Propiedades privadas y públicas
- 🧩 **Modularidad**: Cada ejercicio es independiente

### ❓ ¿Qué es readline?

**Respuesta:** `readline` es un módulo de Node.js que permite:

- 📖 **Lectura de entrada**: Capturar input del usuario
- 💬 **Interfaz interactiva**: Crear programas de consola
- 🔄 **Control de flujo**: Manejar la secuencia de entrada

```typescript
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
```

---

## 🎯 Mejores Prácticas

### ❓ ¿Cómo hago el código más legible?

**Respuesta:** Sigue estas prácticas:

1. **Nombres descriptivos:**
   ```typescript
   // ❌ Malo
   const x = 18;
   
   // ✅ Bueno
   const MINIMUM_AGE = 18;
   ```

2. **Comentarios útiles:**
   ```typescript
   // ✅ Explicar el propósito
   private static readonly OLD_AGE: number = 18; // Edad mínima para mayoría de edad
   ```

3. **Métodos pequeños:**
   ```typescript
   // ✅ Un método, una responsabilidad
   public validateAge(age: number): number {
       return this.checkAgeRange(age);
   }
   ```

### ❓ ¿Cómo manejo errores correctamente?

**Respuesta:** Usa try-catch y validaciones:

```typescript
public validateAge(age: number): number {
    try {
        if (age < 0 || age > 150) {
            throw new Error("Edad fuera del rango permitido");
        }
        return age;
    } catch (error) {
        console.error("Error:", error.message);
        return -1; // Valor de error
    }
}
```

### ❓ ¿Cómo hago el código más eficiente?

**Respuesta:** Optimiza estos aspectos:

1. **Reutilización de código:**
   ```typescript
   // ✅ Usar ProgramUtil para funcionalidad común
   const util = new ProgramUtil();
   util.init("Mensaje 1", "Mensaje 2");
   ```

2. **Validaciones tempranas:**
   ```typescript
   // ✅ Validar antes de procesar
   if (!this.isValidInput(input)) {
       return;
   }
   ```

---

## 🤝 Contribución

### ❓ ¿Cómo contribuyo al proyecto?

**Respuesta:** Sigue estos pasos:

1. **Fork del repositorio**
2. **Crear una rama:**
   ```bash
   git checkout -b feature/mi-nueva-funcionalidad
   ```
3. **Hacer cambios y commit:**
   ```bash
   git add .
   git commit -m "Agregar nueva funcionalidad"
   ```
4. **Push y Pull Request:**
   ```bash
   git push origin feature/mi-nueva-funcionalidad
   ```

### ❓ ¿Qué tipo de contribuciones son bienvenidas?

**Respuesta:** Cualquier mejora es bienvenida:

- 🐛 **Corrección de bugs**
- ✨ **Nuevas funcionalidades**
- 📚 **Mejoras en documentación**
- 🎨 **Mejoras en la interfaz**
- ⚡ **Optimizaciones de rendimiento**

---

## 📞 Soporte

### ❓ ¿Dónde puedo obtener ayuda?

**Respuesta:** Puedes obtener ayuda en:

- 📖 **Esta wiki**: Documentación completa
- 🐛 **Issues de GitHub**: Reportar problemas
- 💬 **Discusiones**: Preguntas y respuestas
- 📧 **Email**: Contacto directo con el mantenedor

### ❓ ¿Cómo reporto un bug?

**Respuesta:** Crea un issue en GitHub con:

1. **Descripción clara** del problema
2. **Pasos para reproducir** el error
3. **Comportamiento esperado** vs actual
4. **Información del sistema** (OS, Node.js version)
5. **Capturas de pantalla** si es relevante

---

<div align="center">

**[⬅️ API Reference](API-Reference)** | **[🏠 Volver al Home](Home)**

</div>
