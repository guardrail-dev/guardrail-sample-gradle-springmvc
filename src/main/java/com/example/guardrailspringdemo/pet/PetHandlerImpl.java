package com.example.guardrailspringdemo.pet;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import com.example.guardrailspringdemo.definitions.*;

@Component
class PetHandlerImpl implements PetHandler {
    public CompletionStage<PetHandler.AddPetResponse> addPet(final Pet body) {
        return null;
    }

    public CompletionStage<PetHandler.UpdatePetResponse> updatePet(final Pet body) {
        return null;
    }

    public CompletionStage<PetHandler.FindPetsByStatusResponse> findPetsByStatus(final java.util.List<String> status) {
        return null;
    }

    public CompletionStage<PetHandler.FindPetsByStatusEnumResponse> findPetsByStatusEnum(final String status) {
        return null;
    }

    public CompletionStage<PetHandler.FindPetsByTagsResponse> findPetsByTags(final java.util.List<String> tags) {
        return null;
    }

    public CompletionStage<PetHandler.UpdatePetWithFormResponse> updatePetWithForm(final long petId,
                final java.util.Optional<String> name, final java.util.Optional<String> status) {
        return null;
    }

    public CompletionStage<PetHandler.GetPetByIdResponse> getPetById(final long petId) {
        return null;
    }

    public CompletionStage<PetHandler.DeletePetResponse> deletePet(final long petId, final java.util.Optional<String> apiKey,
                final java.util.Optional<Boolean> includeChildren, final java.util.Optional<String> status) {
        return null;
    }

    @Override
    public CompletionStage<PetHandler.UploadFileResponse> uploadFile(final long petId,
                    final java.util.Optional<String> additionalMetadata, final java.util.Optional<MultipartFile> file,
                    final MultipartFile file2, final MultipartFile file3, final long longValue, final long customValue,
                    final java.util.Optional<Long> customOptionalValue) {
        return null;
    }
}
