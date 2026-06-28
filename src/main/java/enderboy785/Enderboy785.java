package enderboy785;

import net.fabricmc.api.ModInitializer;
import net.minecraft.component.ComponentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class Enderboy785 implements ModInitializer {
    public static final String MOD_ID = "enderboy785";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Creamos el ítem y le forzamos a usar el estilo de tooltip personalizado "enderboy785:warden"
    public static final Item CORAZON_DEL_ABISMO = new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, net.minecraft.item.TooltipType type) {
            tooltip.add(Text.literal("Late con la energía del Abismo...").getWithStyle(net.minecraft.text.Style.EMPTY.withColor(0x00AAAA)).get(0));
        }
    };

    @Override
    public void onInitialize() {
        LOGGER.info("Inicializando mod de enderboy785!");
        
        // Registramos el ítem en Minecraft
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "corazon_del_abismo"), CORAZON_DEL_ABISMO);
    }
}